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
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Universal Staging/Earn points page'))

//WebUI.click(findTestObject('Object Repository/Universal Staging/Earn point popups'), FailureHandling.CONTINUE_ON_FAILURE)
//WebUI.dismissAlert()
WebUI.scrollToPosition(99999, 99999, FailureHandling.CONTINUE_ON_FAILURE)

while (!(WebUI.verifyElementPresent(findTestObject('Object Repository/Universal Staging/Earn points all shown button'), 
    10, FailureHandling.CONTINUE_ON_FAILURE))) {
    WebUI.scrollToPosition(99999, 99999, FailureHandling.CONTINUE_ON_FAILURE)

    if (WebUI.verifyTextPresent(short_des1, true, FailureHandling.CONTINUE_ON_FAILURE)) {
        System.out.println('Text found')

      WebUI.takeScreenshot()

        WebUI.closeBrowser()

      
    } else {
        WebUI.click(findTestObject('Universal-Contest entry/View More button'))
    }
}

