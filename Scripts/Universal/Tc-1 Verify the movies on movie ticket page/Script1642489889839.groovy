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
import com.kms.katalon.core.webui.common.WebUiCommonHelper
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.WebElement as WebElement;
import com.kms.katalon.core.util.KeywordUtil
//System.setProperty("webdriver.chrome.driver", "/home/knoldus/Desktop/chromedriver_linux64/chromedriver");
//ChromeOptions options =new ChromeOptions()
//
//options.addArguments("start_maximized")
//options.addArguments("disable-infobars")
//options.addArguments("disable-extensions")
//options.addArguments("--headless")
//options.addArguments("--window-size=1920,1080")
//options.addArguments("--window-size=1920,1080","--disable-gpu", "--disable-extensions", "--no-sandbox", "-incognito")
WebUI.callTestCase(findTestCase('Universal/Login/TC-1 Login with Moviestar'), [('Email') : 'testing12345@yopmail.com', ('Pswrd') : '3TL@testing'], 
    FailureHandling.STOP_ON_FAILURE)
WebUI.delay(5)
WebUI.mouseOver(findTestObject('Object Repository/Universal Staging/a_Validate Purchase'))

WebUI.click(findTestObject('Object Repository/Universal Staging/a_Movie Ticket'))


WebUI.scrollToPosition(999, 999, FailureHandling.STOP_ON_FAILURE)


WebUI.delay(5)
List <WebElement> listofelements = WebUiCommonHelper.findWebElements(findTestObject('Object Repository/Universal Staging/Movies images'), 10)
for(WebElement element :listofelements) {
	System.out.println("movie"  +element.getAttribute('alt')  +element.getAttribute('src'))
	//if((MovieTitle==element.getAttribute('alt'))&&(Imageurl==element.getAttribute('src'))) {
	
		//System.out.println("Your movie name is " +element.getAttribute('alt'))
	}

WebUI.takeScreenshot()

