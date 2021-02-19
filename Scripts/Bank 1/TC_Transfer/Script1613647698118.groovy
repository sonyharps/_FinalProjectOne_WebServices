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

WebUI.click(findTestObject('Bank 1/Page_Create internal money transfer - BankSystem/Money transfers'))

WebUI.click(findTestObject('Bank 1/Page_Create internal money transfer - BankSystem/New Transfer'))

switch (pilihTF.toString()) {
	
	case 'internal':
	
		WebUI.click(findTestObject('Bank 1/Page_Create internal money transfer - BankSystem/Create new payment'))
	
		WebUI.selectOptionByValue(findTestObject('Bank 1/Page_Create internal money transfer - BankSystem/Pilih sumber acc'),
			'a869bdbb-9c18-41c7-b201-1fa79bfeba76', false)
	
		//a869bdbb-9c18-41c7-b201-1fa79bfeba76
		//4984bb89-10a2-4e24-bf65-5511f0bf0433
		//97df75e9-24c3-4033-85bb-123c554fbe18
	
		WebUI.setText(findTestObject('Bank 1/Page_Create internal money transfer - BankSystem/Destination account'),
			destinationAcc)
	
		//ABCL76811692
		//ABCP10035218
		//ABCW32891409
	
		WebUI.selectOptionByValue(findTestObject('Bank 1/Page_Create internal money transfer - BankSystem/pilih sumber acc lain'),
			'ABCP10035218', false)
	
		WebUI.setText(findTestObject('Bank 1/Page_Create internal money transfer - BankSystem/input__Amount'), amount)
	
		WebUI.setText(findTestObject('Bank 1/Page_Create internal money transfer - BankSystem/Description'), desc)
	
		WebUI.click(findTestObject('Bank 1/Page_Create internal money transfer - BankSystem/button_Pay'))
	
		WebUI.click(findTestObject('Bank 1/Page_Create internal money transfer - BankSystem/close pop transfer berhasil'))
	
	break
	
	case 'world':
	
		WebUI.click(findTestObject('Object Repository/Bank 1/Page_Create global money transfer - BankSystem/Create new payment'))
	
		WebUI.selectOptionByValue(findTestObject('Bank 1/Page_Create global money transfer - BankSystem/From acc'),
			'97df75e9-24c3-4033-85bb-123c554fbe18', false)
	
		//4e79e41d-788a-4c72-9241-75b2e5707e48
		//a869bdbb-9c18-41c7-b201-1fa79bfeba76
		//4984bb89-10a2-4e24-bf65-5511f0bf0433
		//97df75e9-24c3-4033-85bb-123c554fbe18
	
		WebUI.setText(findTestObject('Bank 1/Page_Create global money transfer - BankSystem/input_Amount'),
			amount)
	
		WebUI.setText(findTestObject('Bank 1/Page_Create global money transfer - BankSystem/input_SwiftBank code'),
			swiftbank)
	
		WebUI.setText(findTestObject('Bank 1/Page_Create global money transfer - BankSystem/input_Name_DestinationBank'),
			name)
		
			WebUI.selectOptionByValue(findTestObject('Bank 1/Page_Create global money transfer - BankSystem/country'),
				'Malaysia', true)

	
		WebUI.setText(findTestObject('Bank 1/Page_Create global money transfer - BankSystem/Beneficiary, , s name'),
			beneficiary)
	
		WebUI.setText(findTestObject('Bank 1/Page_Create global money transfer - BankSystem/input_AccountIBAN'),
			IBAN)
	
		WebUI.setText(findTestObject('Bank 1/Page_Create global money transfer - BankSystem/Description'),
			Description)
	
		WebUI.click(findTestObject('Bank 1/Page_Create global money transfer - BankSystem/button_Pay'))
	
	break
	
}

WebUI.closeBrowser()

