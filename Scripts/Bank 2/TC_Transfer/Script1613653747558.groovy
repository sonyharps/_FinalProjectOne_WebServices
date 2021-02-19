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

WebUI.click(findTestObject('Bank 2/Page_Create global money transfer - BankSystem/a_Money transfers'))

WebUI.click(findTestObject('Bank 2/Page_Create global money transfer - BankSystem/a_New Transfer'))

switch (pilihbank.toString()) {
	
	case 'internal':
	
		WebUI.click(findTestObject('Bank 2/Page_Create internal money transfer - BankSystem/Create new payment'))
	
		WebUI.selectOptionByValue(findTestObject('Bank 2/Page_Create internal money transfer - BankSystem/source acc'),
			'6995694b-a4ce-4d79-b35a-2da68be60378', false)
	
		WebUI.setText(findTestObject('Bank 2/Page_Create internal money transfer - BankSystem/Destination account'),
			destinationAC)
	
		WebUI.setText(findTestObject('Bank 2/Page_Create internal money transfer - BankSystem/input_Amount'),
			amount)
	
		WebUI.setText(findTestObject('Bank 2/Page_Create internal money transfer - BankSystem/Description'),
			description)
	
		WebUI.click(findTestObject('Bank 2/Page_Create internal money transfer - BankSystem/button_Pay'))
	
	break
	
	case 'world':
	
		WebUI.click(findTestObject('Bank 2/Page_Create global money transfer - BankSystem/Create new payment'))
		
		WebUI.setText(findTestObject('Bank 2/Page_Create global money transfer - BankSystem/Amount'), amount)
		
		WebUI.setText(findTestObject('Bank 2/Page_Create global money transfer - BankSystem/SwiftBank'), swiftbank)
		
		WebUI.setText(findTestObject('Bank 2/Page_Create global money transfer - BankSystem/input_Name'),
			name)
		
		WebUI.selectOptionByValue(findTestObject('Bank 2/Page_Create global money transfer - BankSystem/country'),
			'Australia', true)
		
		WebUI.setText(findTestObject('Bank 2/Page_Create global money transfer - BankSystem/input_concat(Beneficiary, , s name)_Destina_58cce8'),
			benename)
		
		WebUI.setText(findTestObject('Bank 2/Page_Create global money transfer - BankSystem/input_AccountIBAN'),
			IBAN)
		
		WebUI.setText(findTestObject('Bank 2/Page_Create global money transfer - BankSystem/Description'),
			Description)
		
		WebUI.delay(5)
	
	break
}

WebUI.closeBrowser()

