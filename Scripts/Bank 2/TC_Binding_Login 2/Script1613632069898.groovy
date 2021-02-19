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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('http://banksystem-2.herokuapp.com/')

WebUI.maximizeWindow(FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Bank 2/Page_Home - BankSystem/Login'))

WebUI.setText(findTestObject('Bank 2/Page_Log in - BankSystem/Email'), email)

WebUI.setText(findTestObject('Bank 2/Page_Log in - BankSystem/Password'), password)

WebUI.click(findTestObject('Object Repository/Bank 2/Page_Log in - BankSystem/button_Log in'))

if (WebUI.verifyTextPresent('The Email field is required.', false, FailureHandling.OPTIONAL) == true) {
	
		WebUI.setText(findTestObject('Bank 2/Page_Log in - BankSystem/Email'), email2)
	
		WebUI.click(findTestObject('Object Repository/Bank 1/Page_Log in - BankSystem/button_Log in'))
	
}
	else if (WebUI.verifyTextPresent('The Password field is required', false, FailureHandling.OPTIONAL) == true) {
		 
		WebUI.setText(findTestObject('Bank 2/Page_Log in - BankSystem/Password'), password2)
		
		WebUI.click(findTestObject('Object Repository/Bank 1/Page_Log in - BankSystem/button_Log in'))
		
	}
	
	else if (WebUI.verifyTextPresent('Invalid email or password', false, FailureHandling.OPTIONAL) == true) {
		
		WebUI.clearText(findTestObject('Object Repository/Bank 1/Page_Log in - BankSystem/Email'))
		
		WebUI.clearText(findTestObject('Object Repository/Bank 1/Page_Log in - BankSystem/Password'))
		
		WebUI.setText(findTestObject('Bank 2/Page_Log in - BankSystem/Email'), email2)
		
		WebUI.setText(findTestObject('Bank 2/Page_Log in - BankSystem/Password'), password2)
		
		WebUI.click(findTestObject('Object Repository/Bank 1/Page_Log in - BankSystem/button_Log in'))
			
	}
	
 else {
	
	WebUI.delay(1)
	
	WebUI.click(findTestObject('Object Repository/Bank 2/Page_Log in - BankSystem/button_Close'))
	
	}

