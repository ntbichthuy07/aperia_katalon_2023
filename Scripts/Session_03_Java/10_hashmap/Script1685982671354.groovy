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

Map<String, Object> bmi = new HashMap<>()

System.out.println('Name:')

Scanner sc = new Scanner(System.in)

bmi.put('Name', sc.nextLine())

System.out.println('Input height:')

sc = new Scanner(System.in)


bmi.put('Height', sc.nextInt())

System.out.println('Input weight:')

sc = new Scanner(System.in)


bmi.put('Weight', sc.nextInt())

float bmiIndex = bmi.get('Weight') / (bmi.get('Height')/100 * bmi.get('Height')/100)

bmi.put('bmi', bmiIndex)

if (bmiIndex < 16) {
    bmi.put('result', 'Underweight level III')
} else if (bmiIndex < 17) {
    bmi.put('result', 'Underweight level II')
} else if (bmiIndex < 18.5) {
    bmi.put('result', 'Underweight level I')
} else if (bmiIndex < 25) {
    bmi.put('result', 'Normal weight')
} else if (bmiIndex < 30) {
    bmi.put('result', ' Overweight')
} else if (bmiIndex < 35) {
    bmi.put('result', ' Overweight level I')
} else if (bmiIndex < 40) {
    bmi.put('result', ' Overweight level II')
} else {
    bmi.put('result', ' Overweight level III')
}

System.out.println(bmi)