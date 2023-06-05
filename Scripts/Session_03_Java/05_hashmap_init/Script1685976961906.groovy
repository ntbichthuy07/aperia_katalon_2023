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

HashMap <String, String> hash = new HashMap<String, String>()

hash = ["Fullname": "Thuy Nguyen", "Email": "thuy.nguyen@aperia.com", "Country":"Vietnam", "City": "HCM", "District": "Tan Binh", "Ward":"6", "Address": "12 Song Thao"]

System.out.println("Input number:")
Scanner sc = new Scanner(System.in)
n = sc.nextInt()

List<HashMap> keyList = new ArrayList<HashMap>(hash.keySet())

System.out.println(keyList)

HashMap <String, String> newHash = new HashMap<String, String>()
for(int i=0;i<n;i++) {
int index = new Random().nextInt(keyList.size())
String keyName = keyList.get(index)

newHash.put(keyName, hash.get(keyName))

}

System.out.println(newHash)


