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

WebUI.openBrowser('https://caring-connections-qa.azurewebsites.net/')

WebUI.click(findTestObject('Login_Pages/Sign_In_Page/button_Sign_Up'))

WebUI.setText(findTestObject('Login_Pages/Sign_Up_Page/Input_First_Last_Name'), 'Palak Gupta')

WebUI.setText(findTestObject('Login_Pages/Sign_Up_Page/Input_ZIP_code'), '464646')

WebUI.setText(findTestObject('Login_Pages/Sign_Up_Page/Input_Username'), 'pallug1710@gmail.com')

WebUI.setText(findTestObject('Login_Pages/Sign_Up_Page/Input_Password'), 'Palak@12')

WebUI.click(findTestObject('Login_Pages/Sign_Up_Page/input_I am a_role'))

WebUI.click(findTestObject('Login_Pages/Sign_Up_Page/button_Sign_Up'))

