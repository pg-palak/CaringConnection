import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import javax.sound.sampled.AudioInputStream
import javax.sound.sampled.AudioSystem
import javax.sound.sampled.Clip

import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.chrome.ChromeOptions
import org.openqa.selenium.remote.DesiredCapabilities
import org.openqa.selenium.support.ui.ExpectedConditions
import org.openqa.selenium.support.ui.WebDriverWait

import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

System.setProperty('webdriver.chrome.driver', 'C:/Users/YuvarajV/Downloads/chromedriver-win64/chromedriver-win64/chromedriver.exe')

ChromeOptions options = new ChromeOptions()

options.addArguments('start-maximized')

// Set preferences to allow microphone access
options.setExperimentalOption("prefs",
	new HashMap<String, Object>() {{
		put("profile.default_content_setting_values.media_stream_mic", 1);
	}}
);
DesiredCapabilities capabilities = DesiredCapabilities.chrome();
capabilities.setCapability(ChromeOptions.CAPABILITY, options);

WebDriver driver = new ChromeDriver(capabilities);

// Assuming you are using the Katalon Framework for the following lines
DriverFactory.changeWebDriver(driver);

//Open Browser
WebUI.navigateToUrl('https://caring-connections-qa.azurewebsites.net/');

//Set Text in username
WebUI.setText(findTestObject('Login_Page/Login_Page_Objects/Input_Username'), 'Yuvaraj11')

//Select role
WebUI.selectOptionByValue(findTestObject('Login_Page/Login_Page_Objects/Select_Role'), 'Senior', false)

//Set text in email
WebUI.setText(findTestObject('Login_Page/Login_Page_Objects/Input_Email'), 'yuva11@gmail.com')

//click on get started
WebUI.click(findTestObject('Login_Page/Login_Page_Objects/btn_Get Started'))

//WebUI.click (findTestObject('Object Repository/tc-04-signup-scriptingmode/Page_CaringConnections/Page_CaringConnections/button_Re-record'))
//click on I want to speak
WebUI.waitForElementClickable(findTestObject('Profile_Creation_Page/Profile_Creation_Page_Objects/btn_I_Want_To_Speak'), 
    0)

WebUI.click(findTestObject('Profile_Creation_Page/Profile_Creation_Page_Objects/btn_Click_Record'))

try {
    // Load the audio file
    AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File('C:/Users/YuvarajV/Downloads/johnson.wav'))

    // Create a Clip and play the audio
    Clip clip = AudioSystem.getClip()

    clip.open(audioInputStream)

    clip.start()

    // Wait for the audio to finish playing
    while (clip.isRunning()) {
        Thread.sleep(1000 // Wait for 100 milliseconds)
            )
    }
    
    clip.stop()
}
catch (Exception e) {
    e.printStackTrace()
} 

WebUI.click(findTestObject('Profile_Creation_Page/Profile_Creation_Page_Objects/btn_Stop'))

//delay for 30 seconds
WebUI.delay(20)

//Scroll to next button
WebUI.scrollToElement(findTestObject('Profile_Creation_Page/Profile_Creation_Page_Objects/btn_Next'), 0)

//next button clickable
WebUI.waitForElementClickable(findTestObject('Profile_Creation_Page/Profile_Creation_Page_Objects/btn_Next'), 0)

//Click next button
WebUI.click(findTestObject('Profile_Creation_Page/Profile_Creation_Page_Objects/btn_Next'))

//Scroll to save and continue button
WebUI.scrollToElement(findTestObject('Category_View_Page/Category_View_Page_Objects/btn_Save_n_Continue'), 0)

//wait for save&continue button clickable
WebDriverWait wait = new WebDriverWait(driver, 10)

wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath('//button[@type=\'submit\']')))

Thread.sleep(10000)

//click save&continue
WebUI.click(findTestObject('Category_View_Page/Category_View_Page_Objects/btn_Save_n_Continue'))

