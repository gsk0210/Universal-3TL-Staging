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

import internal.GlobalVariable

public class OpenUniversal {

	@Keyword
	public void navigateUniversal() {
		WebUI.openBrowser(GlobalVariable.url)
		WebUI.waitForPageLoad(GlobalVariable.timeOutStaging)
		WebUI.maximizeWindow()
		WebUI.setViewPortSize(1920, 1080)
		WebUI.waitForElementPresent(findTestObject('Object Repository/HomePage/Register_Login_Button'), GlobalVariable.timeOutStaging)
		WebUI.click(findTestObject('Object Repository/HomePage/Register_Login_Button'))
	}

	@Keyword
	public void logIn(String username,String password) {
		WebUI.setText(findTestObject('Object Repository/Login Page/username'), username)
		WebUI.sendKeys(findTestObject('Object Repository/Login Page/password'), password)
		WebUI.click(findTestObject('Object Repository/Login Page/button_login'))
		WebUI.verifyElementPresent(findTestObject('Object Repository/HomePage/Header'),GlobalVariable.timeOutStaging)
	}

	@Keyword
	public void logOut() {
		WebUI.mouseOver(findTestObject('Object Repository/HomePage/Header'))
		WebUI.click(findTestObject('Object Repository/HomePage/DropdownRight/LogOut'))
		WebUI.waitForElementPresent(findTestObject('Object Repository/HomePage/LogOutPopup/Popup'), GlobalVariable.timeOutPopup)
		WebUI.click(findTestObject('Object Repository/HomePage/LogOutPopup/LogoutButton'))
	}
}
