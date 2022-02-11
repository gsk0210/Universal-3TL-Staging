import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('Universal/Login/TC-3 Login with Director'), [('Email') : 'test3004@yopmail.com', ('Pswrd') : '3tl@testing'], 
    FailureHandling.OPTIONAL)
WebUI.delay(5)
WebUI.click(findTestObject('Object Repository/Universal Staging/a_Rewards'))
WebUI.waitForPageLoad(2)

WebUI.scrollToElement(findTestObject('Object Repository/Reward page/Page_Universal All-Access Rewards  Get Rewa_700d57/div_Show All'),
	0, FailureHandling.STOP_ON_FAILURE)
//WebUI.scrollToElement(findTestObject('Object Repository/Universal Staging/div_Show All'), 4)
WebUI.click(findTestObject('Object Repository/Universal Staging/div_Show All'))
WebUI.delay(2)
WebUI.click(findTestObject('Object Repository/Universal Staging/span_Physical'))
//WebUI.scrollToPosition(9999, 9999, FailureHandling.STOP_ON_FAILURE)
//WebUI.delay(3)

	if (WebUI.verifyTextPresent(short_des, true, FailureHandling.CONTINUE_ON_FAILURE)) {
		WebUI.navigateToUrl(url + reward_cat + behavior_id)
   //WebUI.delay(3)
   
	//WebUI.delay(5)
	result = WebUI.getText(findTestObject('Object Repository/Universal Staging/Get movie name'))
		System.out.println("Movie Name is"  +result)
		WebUI.scrollToElement(findTestObject('Object Repository/Universal Staging/Redeem Now button'), 0, FailureHandling.CONTINUE_ON_FAILURE)
	//WebUI.scrollToPosition(999, 999, FailureHandling.STOP_ON_FAILURE)
	WebUI.click(findTestObject('Object Repository/Universal Staging/Redeem Now button'))
      WebUI.delay(2)
	}else {
	     WebUI.verifyElementPresent(findTestObject('Object Repository/Universal Staging/Toast message'), 0, FailureHandling.CONTINUE_ON_FAILURE) 
		  //if (WebUI.verifyTextPresent(popup_message, true, FailureHandling.CONTINUE_ON_FAILURE)) {
		  Toastmessage = WebUI.getText(findTestObject('Object Repository/Universal Staging/Toast message'), FailureHandling.CONTINUE_ON_FAILURE)

		  System.out.println('Already reedemed  ' + Toastmessage)
		
	  
		WebUI.takeScreenshot()
		WebUI.closeBrowser()
	  
	   }
	System.out.println('Your testcase has been failed')



WebUI.closeBrowser()
