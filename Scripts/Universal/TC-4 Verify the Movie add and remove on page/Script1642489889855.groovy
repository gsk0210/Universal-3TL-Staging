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
import com.kms.katalon.core.webui.keyword.internal.WebUIAbstractKeyword
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('Universal/Login/TC-2 Login with Screenwriter'), [('Email') : 'ankit248@yopmail.com', ('Pswrd') : '3TL@testing'], 
    FailureHandling.STOP_ON_FAILURE)


WebUI.click(findTestObject('Object Repository/triall/Page_Universal All-Access Rewards  Get Rewa_700d57/a_Rewards'))

if(WebUI.verifyElementPresent(findTestObject('Object Repository/Universal Staging/Rewards_text'), 0, FailureHandling.CONTINUE_ON_FAILURE)){
	Assert=WebUI.getText(findTestObject('Object Repository/Universal Staging/Rewards_text'), FailureHandling.CONTINUE_ON_FAILURE)
	System.out.println("Welcome in  " +Assert)
}
	WebUI.scrollToPosition(99999, 99999, FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)


WebUI.click(findTestObject('Universal-Contest entry/View More button'))

while (!(WebUI.verifyElementPresent(findTestObject('Universal Staging/All Rewards shown button'), 10, FailureHandling.CONTINUE_ON_FAILURE))) {
   
    WebUI.scrollToPosition(99999, 99999, FailureHandling.STOP_ON_FAILURE)

    
   if( WebUI.click(findTestObject('Universal-Contest entry/View More button'))) {

    WebUI.delay(3)

}
	WebUI.takeFullPageScreenshot()
			WebUI.closeBrowser()
			
}

