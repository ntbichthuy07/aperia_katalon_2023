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
import java.text.SimpleDateFormat as SimpleDateFormat
import java.util.*
import java.time.*

Map<String, Object> info = new HashMap<String, String>()

info = [('Name') : '', ('Birthday') : '', ('Height') : '']

for (int i = 0; i < 3; i++) {
    System.out.println('Input ' + (info.keySet().toArray()[i]))

    Scanner sc = new Scanner(System.in)

    input = sc.nextLine()

    info.replace(info.keySet().toArray()[i], input)
}

LocalDate now = LocalDate.now()

System.out.println(now)

SimpleDateFormat formatter = new SimpleDateFormat('yyyy-MM-dd')

LocalDate date = formatter.parse(info.get('Birthday')).toInstant().atZone(ZoneId.systemDefault()).toLocalDate()

System.out.println(date)

int age = Period.between(date, now).getYears()

info.put('Age', age)

System.out.println(info)