package com.knoldus.universal_staging

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import java.awt.PopupMenu

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
import org.openqa.selenium.WebElement
import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import com.kms.katalon.core.webui.driver.DriverFactory



import internal.GlobalVariable

public class WatchVideo {

	WebDriver driver=DriverFactory.getWebDriver();



	@Keyword
	public void navigateEarnPoints(TestObject videoTitle,String shortDescription,String path,String videoTitleText) {
		boolean earnPointCard=false;
		int verticalPosition=0;
		boolean viewMoreDisabled=false
		WebUI.click(findTestObject('HomePage/EarnPoint'))

		/*if(WebUI.verifyElementPresent(findTestObject('Object Repository/HomePage/Popup'), GlobalVariable.timeOutPopup, FailureHandling.OPTIONAL)) {
		 WebUI.callTestCase(findTestCase('Test Cases/Add a Video on Earn Points Page/Popup Close'), [:],FailureHandling.OPTIONAL)
		 }*/

		//earnPointCard=WebUI.verifyTextPresent(title, false,FailureHandling.CONTINUE_ON_FAILURE)

		while(viewMoreDisabled==false) {
			WebUI.scrollToElement(findTestObject('Object Repository/Earn Point action/Earn Point/ViewMoreButton'), GlobalVariable.timeOutPopup)
			WebUI.click(findTestObject('Object Repository/Earn Point action/Earn Point/ViewMoreButton'))

			if(WebUI.verifyElementNotClickable(findTestObject('Object Repository/Earn Point action/Earn Point/ViewMoreButton'),FailureHandling.OPTIONAL)) {
				WebUI.scrollToPosition(0, 0)
				viewMoreDisabled=true;
			}
		}

		List<WebElement> titles=WebUiCommonHelper.findWebElements(videoTitle, GlobalVariable.timeOutStaging)
		for(WebElement title:titles) {

			if(videoTitleText.equals(title.getText())) {

				WebElement shortD=title.findElement(By.xpath("following-sibling::*"))
				WebUI.verifyElementText(WebUI.convertWebElementToTestObject(shortD),shortDescription)
				WebElement image=title.findElement(By.xpath(".."))
				WebUI.click(WebUI.convertWebElementToTestObject(image, FailureHandling.STOP_ON_FAILURE))
				break;
			}

			//WebUI.verifyElementText(title, videoTitleText)
		}
		/*List<WebElement> shortDescriptions=WebUiCommonHelper.findWebElements(videoTitle, GlobalVariable.timeOutStaging)
		 for(WebElement title:titles) {
		 WebUI.verifyElementText(title, videoTitleText)
		 }*/



		/*while(earnPointCard==false) {
		 WebUI.scrollToPosition(0,verticalPosition)
		 if(WebUI.verifyTextPresent(title, false, FailureHandling.CONTINUE_ON_FAILURE)==true) {
		 earnPointCard==true
		 WebUI.verifyTextPresent(shortDescription, false)
		 WebUI.takeScreenshot("$path"+"EarnPoints.png")
		 break;
		 }
		 verticalPosition=verticalPosition+200
		 }*/
	}

	@Keyword
	public void watchVideo(String longDescription,String points,String path) {
		//WebUI.navigateToUrl('https://universal.3tlstaging.com/earnpoints-action-preview/' + behaviorId)

		WebUI.waitForPageLoad(GlobalVariable.timeOutStaging)

		WebUI.verifyElementText(findTestObject('Earn Point action/Video Preview/Long_Description'), longDescription)

		WebUI.verifyElementText(findTestObject('Earn Point action/Video Preview/Points_below_video'), "WATCH AND EARN $points POINTS")

		WebUI.switchToFrame(findTestObject('Earn Point action/Video Preview/Youtube_video'), GlobalVariable.timeOutStaging)

		WebUI.click(findTestObject('Earn Point action/Video Preview/Youtube_video'))

		WebUI.switchToDefaultContent()

		//WebUI.takeScreenshot("$path"+"preview.png")
	}

	@Keyword
	public void toastMessage(String path) {

		WebUI.waitForElementPresent(findTestObject('Earn Point action/Video Preview/ToastMessage'), 1000)


		//WebUI.takeScreenshot("$path"+"toast.png")

		WebUI.delay(10)
	}

	@Keyword
	public void pointHistory(String points,String title) {


		WebUI.navigateToUrl('https://universal.3tlstaging.com/manage-account/point-history')

		WebUI.waitForPageLoad(GlobalVariable.timeOutStaging)

		WebUI.verifyElementText(findTestObject('Point History/PointHistoryTable/descriptionCell'), "You earned points for watching $title")

		WebUI.verifyElementText(findTestObject('Object Repository/Point History/PointHistoryTable/pointCell'), "+\n$points")
	}

	@Keyword
	public void secondAttempt(String path,TestObject toastElement) {

		WebUI.waitForElementPresent(findTestObject('Earn Point action/Video Preview/ToastMessage'), 1000)

		WebUI.verifyElementText(toastElement, "Sorry! You've earned the maximum points possible for this action")

		//WebUI.takeScreenshot("$path"+"toast.png")
	}
}

