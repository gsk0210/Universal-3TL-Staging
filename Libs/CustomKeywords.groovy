
/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */

import java.lang.String

import com.kms.katalon.core.testobject.TestObject

import com.applitools.eyes.selenium.Eyes

import org.openqa.selenium.WebElement

import com.applitools.eyes.RectangleSize



def static "com.knoldus.universal_staging.OpenUniversal.navigateUniversal"() {
    (new com.knoldus.universal_staging.OpenUniversal()).navigateUniversal()
}


def static "com.knoldus.universal_staging.OpenUniversal.logIn"(
    	String username	
     , 	String password	) {
    (new com.knoldus.universal_staging.OpenUniversal()).logIn(
        	username
         , 	password)
}


def static "com.knoldus.universal_staging.OpenUniversal.logOut"() {
    (new com.knoldus.universal_staging.OpenUniversal()).logOut()
}


def static "com.knoldus.universal_staging.WatchVideo.navigateEarnPoints"(
    	TestObject videoTitle	
     , 	String shortDescription	
     , 	String path	
     , 	String videoTitleText	) {
    (new com.knoldus.universal_staging.WatchVideo()).navigateEarnPoints(
        	videoTitle
         , 	shortDescription
         , 	path
         , 	videoTitleText)
}


def static "com.knoldus.universal_staging.WatchVideo.watchVideo"(
    	String longDescription	
     , 	String points	
     , 	String path	) {
    (new com.knoldus.universal_staging.WatchVideo()).watchVideo(
        	longDescription
         , 	points
         , 	path)
}


def static "com.knoldus.universal_staging.WatchVideo.toastMessage"(
    	String path	) {
    (new com.knoldus.universal_staging.WatchVideo()).toastMessage(
        	path)
}


def static "com.knoldus.universal_staging.WatchVideo.pointHistory"(
    	String points	
     , 	String title	) {
    (new com.knoldus.universal_staging.WatchVideo()).pointHistory(
        	points
         , 	title)
}


def static "com.knoldus.universal_staging.WatchVideo.secondAttempt"(
    	String path	
     , 	TestObject toastElement	) {
    (new com.knoldus.universal_staging.WatchVideo()).secondAttempt(
        	path
         , 	toastElement)
}


def static "com.knoldus.universal_staging.AddMovie.visitMoviesSection"(
    	String webPage	
     , 	TestObject showMoreButton	) {
    (new com.knoldus.universal_staging.AddMovie()).visitMoviesSection(
        	webPage
         , 	showMoreButton)
}


def static "com.knoldus.universal_staging.AddMovie.iterateMoviesAvailable"(
    	TestObject movieImage	
     , 	String movieTitle	
     , 	String imageUrl	) {
    (new com.knoldus.universal_staging.AddMovie()).iterateMoviesAvailable(
        	movieImage
         , 	movieTitle
         , 	imageUrl)
}


def static "com.knoldus.universal_staging.AddMovie.clickBuyNow"(
    	TestObject description	
     , 	TestObject genreObject	
     , 	TestObject ratingObject	
     , 	TestObject buyButton	
     , 	String text	
     , 	String url	
     , 	String rating	
     , 	String genre	
     , 	String movieTitle	) {
    (new com.knoldus.universal_staging.AddMovie()).clickBuyNow(
        	description
         , 	genreObject
         , 	ratingObject
         , 	buyButton
         , 	text
         , 	url
         , 	rating
         , 	genre
         , 	movieTitle)
}


def static "com.kms.katalon.keyword.applitools.BasicKeywords.checkTestObject"(
    	TestObject testObject	
     , 	String testName	) {
    (new com.kms.katalon.keyword.applitools.BasicKeywords()).checkTestObject(
        	testObject
         , 	testName)
}


def static "com.kms.katalon.keyword.applitools.BasicKeywords.checkWindow"(
    	String testName	) {
    (new com.kms.katalon.keyword.applitools.BasicKeywords()).checkWindow(
        	testName)
}


def static "com.kms.katalon.keyword.applitools.BasicKeywords.checkElement"(
    	Eyes eyes	
     , 	WebElement element	) {
    (new com.kms.katalon.keyword.applitools.BasicKeywords()).checkElement(
        	eyes
         , 	element)
}


def static "com.kms.katalon.keyword.applitools.EyesKeywords.eyesClose"(
    	Eyes eyes	) {
    (new com.kms.katalon.keyword.applitools.EyesKeywords()).eyesClose(
        	eyes)
}


def static "com.kms.katalon.keyword.applitools.EyesKeywords.eyesOpen"(
    	String testName	
     , 	RectangleSize viewportSize	) {
    (new com.kms.katalon.keyword.applitools.EyesKeywords()).eyesOpen(
        	testName
         , 	viewportSize)
}


def static "com.kms.katalon.keyword.applitools.EyesKeywords.eyesOpenWithBaseline"(
    	String baselineName	
     , 	String testName	
     , 	RectangleSize viewportSize	) {
    (new com.kms.katalon.keyword.applitools.EyesKeywords()).eyesOpenWithBaseline(
        	baselineName
         , 	testName
         , 	viewportSize)
}


def static "com.kms.katalon.keyword.applitools.EyesKeywords.eyesInit"() {
    (new com.kms.katalon.keyword.applitools.EyesKeywords()).eyesInit()
}
