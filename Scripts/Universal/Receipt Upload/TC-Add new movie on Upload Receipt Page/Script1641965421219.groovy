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

CustomKeywords.'com.knoldus.universal_staging.AddMovie.visitMoviesSection'(webPage, btnShowMore)

CustomKeywords.'com.knoldus.universal_staging.AddMovie.iterateMoviesAvailable'(movieImage, movieTitle, imgUrl)

CustomKeywords.'com.knoldus.universal_staging.AddMovie.clickBuyNow'(longDes, movieGenre, movieRating,buyNowButton ,desText,upheUrl ,ratingsText,genreText,movieTitle)

@com.kms.katalon.core.annotation.SetUp
def startUniversal() {
    CustomKeywords.'com.knoldus.universal_staging.OpenUniversal.navigateUniversal'()

    CustomKeywords.'com.knoldus.universal_staging.OpenUniversal.logIn'(GlobalVariable.username, GlobalVariable.password)
}

