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

String alphabet = 'ABCDEFGHIJKLMNOPQRSTUVWXYZ'
int n = alphabet.length() + 1
while(n>alphabet.length() || n <1) {
System.out.println('Input number 1 - ' + alphabet.length())

Scanner sc = new Scanner(System.in)
n = sc.nextInt()
}

String[] randomList = new String[n]
int charIndex = new Random().nextInt(alphabet.length())

char charValue = alphabet.charAt(charIndex)
randomList[0]=charValue.toString();

int i = 1
while (i<n) {
	 charIndex = new Random().nextInt(alphabet.length())
	
	 charValue = alphabet.charAt(charIndex)
	
	for (int j = 0; j< i; j++) {
		if(randomList[j]==charValue.toString()) {
			i--
			break
		}
		randomList[i]=charValue.toString()
		
	}

	i++
}

System.out.println('Random Alphabet: ' + randomList)