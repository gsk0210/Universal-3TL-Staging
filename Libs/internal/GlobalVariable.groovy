package internal

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.main.TestCaseMain


/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */
public class GlobalVariable {
     
    /**
     * <p></p>
     */
    public static Object url
     
    /**
     * <p></p>
     */
    public static Object timeOutStaging
     
    /**
     * <p></p>
     */
    public static Object email
     
    /**
     * <p></p>
     */
    public static Object password
     
    /**
     * <p></p>
     */
    public static Object timeOutPopup
     
    /**
     * <p>Profile Add New Movie To Validate Code Page : An object representing show more button</p>
     */
    public static Object btnShowMore
     
    /**
     * <p></p>
     */
    public static Object movieImage
     
    /**
     * <p></p>
     */
    public static Object imgUrl
     
    /**
     * <p></p>
     */
    public static Object movieTitle
     
    /**
     * <p></p>
     */
    public static Object longDes
     
    /**
     * <p></p>
     */
    public static Object movieGenre
     
    /**
     * <p></p>
     */
    public static Object movieRating
     
    /**
     * <p></p>
     */
    public static Object buyNowButton
     
    /**
     * <p></p>
     */
    public static Object genreText
     
    /**
     * <p></p>
     */
    public static Object desText
     
    /**
     * <p></p>
     */
    public static Object ratingsText
     
    /**
     * <p></p>
     */
    public static Object upheUrl
     
    /**
     * <p>Profile Add Video To Earn Point Page : The title of the video action added on the Earn Points page.</p>
     */
    public static Object videoTitle
     
    /**
     * <p>Profile Add Video To Earn Point Page : Short description of the newly added video on the Earn Points page.</p>
     */
    public static Object shortDescription
     
    /**
     * <p>Profile Add Video To Earn Point Page : Long Description on the added preview page</p>
     */
    public static Object long_description
     
    /**
     * <p>Profile Add Video To Earn Point Page : The test object represents the toast message that appears after finishing the video.</p>
     */
    public static Object toastElement
     
    /**
     * <p>Profile Add Video To Earn Point Page : The test object represents titles of the Earn point action</p>
     */
    public static Object videoTitles
     

    static {
        try {
            def selectedVariables = TestCaseMain.getGlobalVariables("default")
			selectedVariables += TestCaseMain.getGlobalVariables(RunConfiguration.getExecutionProfile())
            selectedVariables += TestCaseMain.getParsedValues(RunConfiguration.getOverridingParameters())
    
            url = selectedVariables['url']
            timeOutStaging = selectedVariables['timeOutStaging']
            email = selectedVariables['email']
            password = selectedVariables['password']
            timeOutPopup = selectedVariables['timeOutPopup']
            btnShowMore = selectedVariables['btnShowMore']
            movieImage = selectedVariables['movieImage']
            imgUrl = selectedVariables['imgUrl']
            movieTitle = selectedVariables['movieTitle']
            longDes = selectedVariables['longDes']
            movieGenre = selectedVariables['movieGenre']
            movieRating = selectedVariables['movieRating']
            buyNowButton = selectedVariables['buyNowButton']
            genreText = selectedVariables['genreText']
            desText = selectedVariables['desText']
            ratingsText = selectedVariables['ratingsText']
            upheUrl = selectedVariables['upheUrl']
            videoTitle = selectedVariables['videoTitle']
            shortDescription = selectedVariables['shortDescription']
            long_description = selectedVariables['long_description']
            toastElement = selectedVariables['toastElement']
            videoTitles = selectedVariables['videoTitles']
            
        } catch (Exception e) {
            TestCaseMain.logGlobalVariableError(e)
        }
    }
}
