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

//open url
WebUI.openBrowser('https://caring-connections-qa.azurewebsites.net/')

//Enter UserName
WebUI.setText(findTestObject('Login_Page/Login_Page_Objects/Input_Username'), 'Naveen')

//Select Role
WebUI.selectOptionByValue(findTestObject('Login_Page/Login_Page_Objects/Select_Role'), 'Companion', false)

//Enter Email
WebUI.setText(findTestObject('Login_Page/Login_Page_Objects/Input_Email'), 'naveen44@gmail.com')

//Click on Get Started
WebUI.click(findTestObject('Login_Page/Login_Page_Objects/btn_Get Started'))

//Verify point-3 "Expectations from Senior"
WebUI.verifyElementPresent(findTestObject('Object Repository/Profile_Creation_Page/Profile_Creation_Page_Objects/txt_p3_Expectations_From_Senior'), 
    0)

//Wait for audio to finish
WebUI.delay(40)

//Click on I want to type button
WebUI.click(findTestObject('Profile_Creation_Page/Profile_Creation_Page_Objects/btn_I_Want_To_Type'))

//wait for 5 sec
WebUI.delay(5)

//enter you profie info
WebUI.setText(findTestObject('Profile_Creation_Page/Profile_Creation_Page_Objects/Input_I_Want_To_Type'), 'Greetings, I\'m Naveen , a dedicated environmental scientist, embracing my 40 years of existence. Armed with a Ph.D. in ecological research, I\'ve spent the past decade delving into the intricate dynamics of ecosystems. Besides the scientific realm, I find immense joy in expressing my creativity through the world of photography, capturing the mesmerizing moments of the natural world. In my quest for growth, I\'m in search of a mentor who can provide valuable insights as I navigate the intricate world of environmental research. On a personal front, I prioritize a balanced lifestyle despite managing allergies, with regular hiking sessions ensuring both my physical and mental well-being. Life is a captivating journey, and I eagerly anticipate capturing more moments of beauty and discovery with each passing day.')

//scroll to next btn
WebUI.scrollToElement(findTestObject('Object Repository/Profile_Creation_Page/Profile_Creation_Page_Objects/btn_Next'), 
    0)

//click on next btn
WebUI.click(findTestObject('Profile_Creation_Page/Profile_Creation_Page_Objects/btn_Next'))

//wait for page to load successfully
WebUI.delay(12)

//scroll to save and continue btn
WebUI.scrollToElement(findTestObject('Object Repository/Category_View_Page/Category_View_Page_Objects/btn_Save_n_Continue'), 
    0)

//click on save and continue btn
WebUI.click(findTestObject('Object Repository/Category_View_Page/Category_View_Page_Objects/btn_Save_n_Continue'))

//verify thankyou page
WebUI.verifyElementPresent(findTestObject('Object Repository/Thankyou_Page/Thankyou_Page_Objects/txt_h1_Thank you'), 0)

