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

//maximise window
WebUI.maximizeWindow()

//Enter UserName
WebUI.setText(findTestObject('Login_Page/Login_Page_Objects/Input_Username'), 'Demo')

//Select Role
WebUI.selectOptionByValue(findTestObject('Login_Page/Login_Page_Objects/Select_Role'), 'Senior', false)

//Enter Email
WebUI.setText(findTestObject('Login_Page/Login_Page_Objects/Input_Email'), 'demo11@gmail.com')

//Click on Get Started
WebUI.click(findTestObject('Login_Page/Login_Page_Objects/btn_Get Started'))

//Verify point-3 "Expectations from Companion"
WebUI.verifyElementPresent(findTestObject('Profile_Creation_Page/Profile_Creation_Page_Objects/Text_Expectations_From_Companion'),
	10)

//Verify Text "Select the Button of your choice"
WebUI.verifyElementPresent(findTestObject('Profile_Creation_Page/Profile_Creation_Page_Objects/Text_Select the button of your choice to create your profile'),
	10)

//Verify Text "We are exicted"
WebUI.verifyElementPresent(findTestObject('Profile_Creation_Page/Profile_Creation_Page_Objects/Text_We are excited'), 10)


//Click on I want to type button
WebUI.waitForElementClickable(findTestObject('Profile_Creation_Page/Profile_Creation_Page_Objects/btn_I_Want_To_Type'), 
    47)

WebUI.click(findTestObject('Profile_Creation_Page/Profile_Creation_Page_Objects/btn_I_Want_To_Type'))

//enter you profie info
WebUI.setText(findTestObject('Profile_Creation_Page/Profile_Creation_Page_Objects/Input_I_Want_To_Type'), 'Greetings, I\'m Yuvaraj, a seasoned explorer in the journey of life, joyfully celebrating my 58 years of existence. With a background in environmental science, I dedicated decades to understanding and preserving the natural world. Beyond scientific pursuits, I find solace in the rhythm of pottery, shaping clay into intricate forms, and the therapeutic art of cooking. In a companion, I seek someone who shares my passion for environmental conservation and has an appreciation for the creative blend of artistry and sustainable living. Health-wise, I\'ve faced challenges with asthma, but with careful management and regular breathing exercises, I continue to pursue my passions with vigor. Life has been a captivating adventure, and I look forward to molding new experiences with a like-minded soul who appreciates the beauty of nature and the creativity of the human spirit.')

//scroll to next btn
WebUI.scrollToElement(findTestObject('Profile_Creation_Page/Profile_Creation_Page_Objects/button_Next'), 10)

//click on next btn
WebUI.click(findTestObject('Profile_Creation_Page/Profile_Creation_Page_Objects/button_Next'))

//scroll to save and continue btn
WebUI.scrollToElement(findTestObject('Object Repository/Category_View_Page/Category_View_Page_Objects/btn_Save_n_Continue'), 
    180)

Thread.sleep(10000)

//click on save and continue btn
WebUI.click(findTestObject('Object Repository/Category_View_Page/Category_View_Page_Objects/btn_Save_n_Continue'))

//verify thankyou page
WebUI.verifyElementPresent(findTestObject('Object Repository/Thankyou_Page/Thankyou_Page_Objects/txt_h1_Thank you'), 0)

WebUI.closeBrowser()

