package com.knoldus.universal_staging

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import org.openqa.selenium.WebElement as WebElement

import internal.GlobalVariable

public class AddMovie {

	@Keyword
	public void visitMoviesSection(String webPage,TestObject showMoreButton) {

		WebUI.delay(5)
		WebUI.navigateToUrl("https://universal.3tlstaging.com/"+webPage)
		//WebUI.mouseOver(findTestObject('HomePage/ValidatePurchase'))

		//WebUI.click(findTestObject('HomePage/DropdownLeft/DropdownRU'))
		WebUI.scrollToElement(showMoreButton, GlobalVariable.timeOutPopup)
	}

	@Keyword
	public void iterateMoviesAvailable(TestObject movieImage,String movieTitle,String imageUrl) {
		List<WebElement> images = WebUiCommonHelper.findWebElements(movieImage,10)

		for (WebElement image : images) {
			if ((movieTitle == image.getAttribute('alt')) && (imageUrl == image.getAttribute('src'))) {
				WebUI.click(WebUI.convertWebElementToTestObject(image))
			}
		}
	}

	@Keyword
	public void clickBuyNow(TestObject description,TestObject genreObject,TestObject ratingObject,TestObject buyButton, String text,String url,String rating,String genre,String movieTitle) {
		WebUI.verifyElementText(description, text)
		WebUI.verifyElementText(genreObject, "Genre:"+genre)
		WebUI.verifyElementText(ratingObject,"Rating:"+ rating)
		WebUI.click(buyButton)
		WebUI.switchToWindowUrl(url)
		WebUI.verifyElementAttributeValue(findTestObject('PurchaseValidation/ValidateCodePage/UpheImage'), "title",movieTitle,GlobalVariable.timeOutStaging)
	}
}
