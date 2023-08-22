import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import javax.wsdl.WSDLElement

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

//Open browser

WebUI.openBrowser('https://www.fahasa.com/customer/account/create')
WebUI.maximizeWindow()

// Click tab
WebUI.click(findTestObject('Object Repository/Session_05_PageObj/tab_login'))

// Verify button disable
//WebUI.verifyElementHasAttribute('Object Repository/Session_05_PageObj/btn_login', 'disabled',0)
//WebUI.verifyElementNotClickable('Object Repository/Session_05_PageObj/btn_login')
//attribute = WebUI.getAttribute(findTestObject('Object Repository/Session_05_PageObj/btn_login'), 'disabled')

assert WebUI.getAttribute(findTestObject('Object Repository/Session_05_PageObj/btn_login'), 'disabled') != null

// Input username and password
WebUI.setText(findTestObject('Object Repository/Session_05_PageObj/input_username'),"thuy.nguyen@aperia.com")
WebUI.setText(findTestObject('Object Repository/Session_05_PageObj/input_password'),"thuy.nguyen@aperia.com")

// Verify button enable
assert WebUI.getAttribute(findTestObject('Object Repository/Session_05_PageObj/btn_login'), 'disabled') == null

// Click Login
WebUI.click(findTestObject('Object Repository/Session_05_PageObj/btn_login'))

// Verify error message
WebUI.verifyElementPresent(findTestObject('Object Repository/Session_05_PageObj/txt_errorMsg'), 3)
WebUI.verifyTextPresent("Số điện thoại/Email hoặc Mật khẩu sai!", false)


//Take screenshot
WebUI.takeScreenshot()
WebUI.closeBrowser()
