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
WebUI.click(findTestObject('Login_Pages/Sign_In_Page/button_Sign_Up'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Login_Pages/Sign_Up_Page/Input_First_Last_Name'), 'Yuvaraj')

WebUI.setText(findTestObject('Login_Pages/Sign_Up_Page/Input_ZIP_code'), '600017')

WebUI.setText(findTestObject('Login_Pages/Sign_Up_Page/Input_Username'), 'Test19@gmail.com')

WebUI.setEncryptedText(findTestObject('Login_Pages/Sign_Up_Page/Input_Password'), 'N1aIAJN9UZiGeVzFWHWkUQ==')

WebUI.click(findTestObject('Login_Pages/Sign_Up_Page/input_Senior'))

WebUI.click(findTestObject('Login_Pages/Sign_Up_Page/button_Sign_Up'))

//Verify point-3 "Expectations from Companion"
WebUI.verifyElementPresent(findTestObject('Profile_Creation_Page/Profile_Creation_Page_Objects/Text_Expectations_From_Companion'), 
    10)

//Verify Text "Select the Button of your choice"
WebUI.verifyElementPresent(findTestObject('Profile_Creation_Page/Profile_Creation_Page_Objects/Text_Select the button of your choice to create your profile'), 
    10)

//Verify Text "We are exicted"
WebUI.verifyElementPresent(findTestObject('Profile_Creation_Page/Profile_Creation_Page_Objects/Text_We are excited'), 10)

//Click on I want to type button
WebUI.waitForElementClickable(findTestObject('Profile_Creation_Page/Profile_Creation_Page_Objects/btn_I want to type'), 
    60)

WebUI.click(findTestObject('Profile_Creation_Page/Profile_Creation_Page_Objects/btn_I want to type'))

Thread.sleep(2000)

//enter you profie info
WebUI.setText(findTestObject('Profile_Creation_Page/Profile_Creation_Page_Objects/Input_I_Want_To_Type'), 'Hey, I\'m Tony Mollica. I did my undergraduate in Nashville and my undergrad specialty or specialization was communication and then from there I went and did my master\'s from Tennessee, South Nashville, Tennessee and I specialized in marketing and from there I have done some professional certifications from Harvard and Stanford related to leadership programs and and art of selling. Proceed to the next prompt or .I began my journey as a management consultant in a smaller company in 1999, from there I made my, I worked there for five years, then I went to a privately held company for another five years, where I was heading the operations, I was the operations manager, and that was again in Nashville, before I moved to Dallas, Texas, and I spent, I worked for a pharmaceutical company in Dallas, Texas, for another ten years, and after doing that, I switched to a infusion company, and I headed their operations from 2013 to 2020, and then I decided to retire from there, Yeah it was kind of interesting after taking early retirement I thought I\'ll have fun and I will travel overseas. The first year or two were very exciting and then I started feeling lonely and I was feeling bored but at the same time I tried to go back to the job, interviewed, didn\'t find any job so that really, I don\'t have any hobbies. In past I used to enjoy football and Green Bay Packers were my favorite team. Unfortunately, none of that is holding true now. I\'m really in a place where I don\'t have much to do. I sit and watch TV. That\'s pretty much my life. .I would love to be matched with a companion who is working in a corporate world. I spent majority of my life in corporate world, and it will be great to relive my experiences with someone in the common field. One more thing, the companion should bring a positive outlook for life and that will be important for me to get through this phase of my life.I experienced prostate cancer 10 years back and underwent surgery. I don’t have any issues currently and living healthy life.')

//scroll to next btn
WebUI.scrollToElement(findTestObject('Profile_Creation_Page/Profile_Creation_Page_Objects/button_Next'), 30)

//click on next btn
WebUI.click(findTestObject('Profile_Creation_Page/Profile_Creation_Page_Objects/button_Next'))

WebUI.waitForPageLoad(180)

Education = WebUI.getText(findTestObject('Category_View_Page/Category_View_Page_Objects/Input_Edit_Educational_Info'))

System.out.println(Education)

Hobbies = WebUI.getText(findTestObject('Category_View_Page/Category_View_Page_Objects/Input_Edit_Appropriate_Hobbies'))

System.out.println(Hobbies)

Expectation = WebUI.getText(findTestObject('Category_View_Page/Category_View_Page_Objects/Input_Edit_expectation'))

System.out.println(Expectation)

Others = WebUI.getText(findTestObject('Category_View_Page/Category_View_Page_Objects/Input_Edit_Appropriate_Health'))

System.out.println(Others)

//scroll to save and continue btn
WebUI.scrollToElement(findTestObject('Category_View_Page/Category_View_Page_Objects/btn_Save_n_Continue'), 30)

Thread.sleep(5000)

//click on save and continue btn
WebUI.click(findTestObject('Category_View_Page/Category_View_Page_Objects/btn_Save_n_Continue'))

//verify thankyou page
WebUI.verifyElementPresent(findTestObject('Thankyou_Page/Thankyou_Page_Objects/txt_h1_Thank you'), 30)

WebUI.closeBrowser()

