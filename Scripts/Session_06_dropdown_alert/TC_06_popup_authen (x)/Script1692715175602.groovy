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

WebUI.openBrowser('https://www.zingpoll.com/')
WebUI.maximizeWindow()

'Click Sign In button'
WebUI.click(findTestObject('Object Repository/Session_06_PageObj/btn_signin'))

'Wait for Popup displayed'
WebUI.waitForElementVisible(findTestObject('Object Repository/Session_06_PageObj/dig_sigin'), 20)

'Click Sign In button'
WebUI.click(findTestObject('Object Repository/Session_06_PageObj/btn_login'))

'Verify invalidation message “Please enter your email/password'
WebUI.waitForElementVisible(findTestObject('Object Repository/Session_06_PageObj/msg_email'),3)
WebUI.waitForElementVisible(findTestObject('Object Repository/Session_06_PageObj/msg_pwd'),3)

'Close popup'
WebUI.click(findTestObject('Object Repository/Session_06_PageObj/btn_close_popup_authen'))

//Take screenshot
WebUI.takeScreenshot()
WebUI.closeBrowser()