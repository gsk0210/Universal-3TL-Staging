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
import com.kms.katalon.core.webui.keyword.internal.WebUIAbstractKeyword as WebUIAbstractKeyword
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('Universal/Login/TC-1 Login with Moviestar'), [('Email') : 'testing12345@yopmail.com', ('Pswrd') : '3TL@testing'
        , ('url') : 'https://universal.3tlstaging.com/home'], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Universal Staging/a_Rewards'))

//WebUI.waitForPageLoad(2)
WebUI.scrollToElement(findTestObject('Object Repository/Reward page/Page_Universal All-Access Rewards  Get Rewa_700d57/div_Show All'), 
    0, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Reward page/Page_Universal All-Access Rewards  Get Rewa_700d57/div_Show All'))

WebUI.click(findTestObject('Object Repository/Reward page/Page_Universal All-Access Rewards  Get Rewa_700d57/span_Digital'))

WebUI.scrollToPosition(999, 999, FailureHandling.CONTINUE_ON_FAILURE)

if (WebUI.verifyTextPresent(short_des, true, FailureHandling.CONTINUE_ON_FAILURE)) {
    if (WebUI.verifyTextPresent(long_des, true, FailureHandling.CONTINUE_ON_FAILURE)) {
        WebUI.click(findTestObject('Object Repository/Universal-Contest entry/Reedem now button'))

        result = WebUI.getText(findTestObject('Object Repository/Universal Staging/Get movie name'))

        System.out.println(result)

        WebUI.scrollToElement(findTestObject('Object Repository/Universal Staging/Redeem Now button'), 0, FailureHandling.CONTINUE_ON_FAILURE)

        WebUI.click(findTestObject('Object Repository/Universal Staging/Redeem Now button'))

        if (WebUI.verifyElementPresent(findTestObject('Object Repository/Universal Staging/Toast message'), 0, FailureHandling.CONTINUE_ON_FAILURE)) {
            //if (WebUI.verifyTextPresent(popup_message, true, FailureHandling.CONTINUE_ON_FAILURE)) {
            Toastmessage = WebUI.getText(findTestObject('Object Repository/Universal Staging/Toast message'), FailureHandling.CONTINUE_ON_FAILURE)

            System.out.println('Already reedemed  ' + Toastmessage)
        } else {
            WebUI.verifyTextPresent(success_msg, true, FailureHandling.STOP_ON_FAILURE)

            System.out.println('Successfully reedemed')
        }
    } else {
        System.out.println('Your testcase has been failed')
    }
}

WebUI.closeBrowser()

