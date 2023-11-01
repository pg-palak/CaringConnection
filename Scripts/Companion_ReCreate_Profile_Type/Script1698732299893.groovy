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

//Maximize the window
WebUI.maximizeWindow()

//Enter UserName
WebUI.setText(findTestObject('Login_Page/Login_Page_Objects/Input_Username'), 'Naveen')

//Select Role Companion
WebUI.selectOptionByValue(findTestObject('Login_Page/Login_Page_Objects/Select_Role'), 'Companion', false)

//Enter Email
WebUI.setText(findTestObject('Login_Page/Login_Page_Objects/Input_Email'), 'naveen44@gmail.com')

//Click on Get Started
WebUI.click(findTestObject('Login_Page/Login_Page_Objects/btn_Get Started'))

//scroll to save and continue btn
WebUI.scrollToElement(findTestObject('Object Repository/Category_View_Page/Category_View_Page_Objects/btn_Save_n_Continue'), 
    0)

//Click on re-record
WebUI.click(findTestObject('Object Repository/Category_View_Page/Category_View_Page_Objects/button_Re-record'))

//click on proceed
WebUI.click(findTestObject('Object Repository/Category_View_Page/Category_View_Page_Objects/btn_Proceed_ReRecord'))

//Verify point-3 "Expectations from Companion"
WebUI.verifyElementPresent(findTestObject('Profile_Creation_Page/Profile_Creation_Page_Objects/txt_p3_Expectations_From_Senior'), 
    0)

//Wait for audio to finish
WebUI.delay(40)

//click on I want to type btn
WebUI.click(findTestObject('Profile_Creation_Page/Profile_Creation_Page_Objects/btn_I_Want_To_Type'))

//wait for 5 sec
WebUI.delay(5)

//enter your new profile info
WebUI.setText(findTestObject('Profile_Creation_Page/Profile_Creation_Page_Objects/Input_I_Want_To_Type'), 'Hello! I’m Naveen, a passionate 24-year-old stepping into the fascinating world of philosophy. Currently pursuing a degree in philosophy, I’m deeply interested in exploring the profound questions of existence. My journey is just taking off, and I eagerly absorb wisdom like a book, with aspirations of becoming a philosopher. In my leisure time, I find peace in playing the guitar, immersing myself in the rhythm of blues music, and volunteering at a local animal shelter, where I learn so much about compassion and care. As I embark on this chapter, I look up to seniors for their insights and advice, hoping to gain from their rich life experiences. Health-wise, I’ve had a few instances of asthma, but a balanced diet and regular meditation practice keep me fit and ready for the adventures that lie ahead. Life is a philosophical puzzle waiting to be solved, and I’m thrilled to delve into its mysteries with each passing day.')

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

