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
WebUI.setText(findTestObject('Login_Page/Login_Page_Objects/Input_Username'), UserName)

//Select Role
WebUI.selectOptionByValue(findTestObject('Login_Page/Login_Page_Objects/Select_Role'), Role, false)

//Enter Email
WebUI.setText(findTestObject('Login_Page/Login_Page_Objects/Input_Email'), Email)

//Click on Get Started
WebUI.click(findTestObject('Login_Page/Login_Page_Objects/btn_Get Started'))

//Update the Text of Education category
WebUI.setText(findTestObject('Category_View_Page/Category_View_Page_Objects/Input_Edit_Educational_Info'), NewEducationInfo)

//Update the Text of Education category
WebUI.setText(findTestObject('Category_View_Page/Category_View_Page_Objects/Input_Edit_Appropriate_Hobbies'), NewHobbiesInfo)

//Update the Text of Education category
WebUI.setText(findTestObject('Category_View_Page/Category_View_Page_Objects/Input_Edit_expectation'), NewExpectationInfo)

//Update the Text of Education category
WebUI.setText(findTestObject('Category_View_Page/Category_View_Page_Objects/Input_Edit_Appropriate_Health'), NewHealthInfo)

//scroll to save and continue btn
WebUI.scrollToElement(findTestObject('Object Repository/Category_View_Page/Category_View_Page_Objects/btn_Save_n_Continue'), 
    0)

//click on save and continue btn
WebUI.click(findTestObject('Object Repository/Category_View_Page/Category_View_Page_Objects/btn_Save_n_Continue'))

//verify thankyou page
WebUI.verifyElementPresent(findTestObject('Object Repository/Thankyou_Page/Thankyou_Page_Objects/txt_h1_Thank you'), 0)

WebUI.closeBrowser()

