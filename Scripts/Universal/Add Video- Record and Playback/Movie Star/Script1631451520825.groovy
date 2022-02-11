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

boolean earnPointCard=false;
int verticalPosition=0

WebUI.waitForPageLoad(GlobalVariable.timeOutStaging)

WebUI.callTestCase(findTestCase('Add a Video on Earn Points Page/Popup Close'), [:], FailureHandling.OPTIONAL)

WebUI.click(findTestObject('HomePage/EarnPoint'))

WebUI.callTestCase(findTestCase('Add a Video on Earn Points Page/Popup Close'), [:], FailureHandling.OPTIONAL)

earnPointCard=WebUI.verifyTextPresent(videoTitle, false,FailureHandling.CONTINUE_ON_FAILURE)

/*WebUI.verifyTextPresent(videoTitle, false)

WebUI.verifyTextPresent(shortDescription, false)*/


while(earnPointCard==false) {
	WebUI.scrollToPosition(0,verticalPosition)
	if(WebUI.verifyTextPresent(videoTitle, false, FailureHandling.CONTINUE_ON_FAILURE)==true) {
		earnPointCard==true
		break;
	}
	verticalPosition=verticalPosition+500
}	



//WebUI.scrollToElement(findTestObject('Earn Point action/Earn Point/Earn Point card'), GlobalVariable.timeOutStaging)

WebUI.takeScreenshot(savePath, null)

WebUI.navigateToUrl('https://universal.3tlstaging.com/earnpoints-action-preview/' + behavior_id)

WebUI.waitForPageLoad(GlobalVariable.timeOutStaging)

WebUI.verifyElementText(findTestObject('Earn Point action/Video Preview/Long_Description'), long_description)

WebUI.verifyElementText(findTestObject('Earn Point action/Video Preview/Points_below_video'), "WATCH AND EARN $points POINTS")

WebUI.switchToFrame(findTestObject('Earn Point action/Video Preview/Youtube_video'), GlobalVariable.timeOutStaging)

WebUI.click(findTestObject('Earn Point action/Video Preview/Youtube_video'))

WebUI.switchToDefaultContent()

WebUI.takeScreenshot(savePreview, null)

WebUI.waitForElementPresent(findTestObject('Earn Point action/Video Preview/ToastMessage'), 1000)

WebUI.takeScreenshot("$path"+"toast.png")

WebUI.delay(10)

WebUI.mouseOver(findTestObject('HomePage/Header'))

WebUI.click(findTestObject('HomePage/PointHistory'))

WebUI.waitForPageLoad(GlobalVariable.timeOutStaging)

WebUI.verifyElementText(findTestObject('Point History/Description'), " You earned points for watching $title")

WebUI.verifyElementText(findTestObject('Point History/Points'), "+$points")

@com.kms.katalon.core.annotation.SetUp
def Initialization() {
    CustomKeywords.'com.knoldus.universal_staging.OpenUniversal.navigateUniversal'()

    CustomKeywords.'com.knoldus.universal_staging.OpenUniversal.logIn'(userEmail, password)
}

