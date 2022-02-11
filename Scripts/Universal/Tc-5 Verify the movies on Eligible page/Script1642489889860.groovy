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

WebUI.callTestCase(findTestCase('Universal/Login/TC-2 Login with Screenwriter'), [('Email') : 'ankit248@yopmail.com', ('Pswrd') : '3TL@testing'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.mouseOver(findTestObject('Object Repository/eligible movie/Page_Universal All-Access Rewards  Get Rewa_700d57/a_Validate Purchase'))

WebUI.click(findTestObject('Object Repository/eligible movie/Page_Universal All-Access Rewards  Get Rewa_700d57/a_Eligible Movies'))

WebUI.delay(2)

WebUI.scrollToPosition(999, 999, FailureHandling.CONTINUE_ON_FAILURE)

if (WebUI.verifyTextPresent(title, true)) {
   Movie_validation = WebUI.verifyTextPresent(Validation_type, true)

    Movie_format=WebUI.verifyTextPresent(format, true)

   Movie_UPC= WebUI.verifyTextPresent(UPC, true)
   Movie_name = WebUI.getText(findTestObject('Object Repository/Universal Staging/Eligible movie name'))
	System.out.println("Eligible movie name " +Movie_name)

	WebUI.takeScreenshot()
			WebUI.closeBrowser()
} else {
	System.out.println("Unable to find the eligible movie name")
    WebUI.closeBrowser()
	
}

