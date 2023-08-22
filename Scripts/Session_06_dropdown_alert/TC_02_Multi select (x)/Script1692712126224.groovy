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

String data = ["January", "February", "April", "August", "December"]
String monthN = ["1", "2", "4", "8", "12"]
//
//HasMap <String, String> month = new HasMap<String, String>() 
//month =["1": "January", "2":"February", "3":"April", "4":"August", "5":"December" ]

WebUI.openBrowser('https://multiple-select.wenzhixin.net.cn/examples#basic.html')
WebUI.maximizeWindow()

// open dropdown list
WebUI.click(findTestObject('Object Repository/Session_06_PageObj/drp_month'))


//select item
WebUI.click(findTestObject('Object Repository/Session_06_PageObj/input_items'))

WebUI.verifyElementAttributeValue(findTestObject('Object Repository/Session_06_PageObj/drp_month'), 'text()', "January",3 )

////Take screenshot
WebUI.takeScreenshot()
WebUI.closeBrowser()

