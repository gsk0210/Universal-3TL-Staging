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

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)
WebUI.navigateToUrl(GlobalVariable.url)
WebUI.delay(5)
WebUI.maximizeWindow()
if (WebUI.verifyTextPresent('REGISTER / LOGIN', true, FailureHandling.STOP_ON_FAILURE)){
		WebUI.click(findTestObject('Universal Staging/a_Register  Login'))

		WebUI.setText(findTestObject('Universal Staging/input_USERNAME OR EMAIL_mat-input-0'),
			Email)

		WebUI.setText(findTestObject('Universal Staging/input_PASSWORD_mat-input-1'),
			Pswrd)

		WebUI.click(findTestObject('Universal Staging/button_Login'))
		WebUI.delay(2)
		
		
		User_name = WebUI.getText(findTestObject('Object Repository/Universal Staging/Tier Name'))
		Tier_name = WebUI.getText(findTestObject('Object Repository/Universal Staging/Tier Namee'), FailureHandling.CONTINUE_ON_FAILURE)
			System.out.println("Welcome " +User_name)
			System.out.println("you are in " +Tier_name)
			
			WebUI.takeScreenshot()
}else {
	WebUI.closeBrowser()
	System.out.println("Oops ! sorry can't login")
}




