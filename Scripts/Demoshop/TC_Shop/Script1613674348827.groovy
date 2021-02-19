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

switch (shopping.toString()) {
	
	case 'camera':
	
		WebUI.click(findTestObject('Demoshop/Page_DemoShop/button_Buy now1'))
		
		switch (payment.toString()) {
			
			case 'card':
			
				WebUI.click(findTestObject('Demoshop/Page_DemoShop/button_Pay by card'))
			
				WebUI.setText(findTestObject('Demoshop/Page_DemoShop/Card number'), cardnumber)
			
				WebUI.setText(findTestObject('Demoshop/Page_DemoShop/Cardholder name'), cardholder)
			
				WebUI.setText(findTestObject('Demoshop/Page_DemoShop/ExpiryDate'), expired)
			
				WebUI.setText(findTestObject('Demoshop/Page_DemoShop/security code'), security)
			
				WebUI.click(findTestObject('Demoshop/Page_DemoShop/button_Pay'))
			
				WebUI.click(findTestObject('Demoshop/Page_DemoShop/a_DemoShop'))
			
			break
			
			case 'direct':
			
				WebUI.click(findTestObject('Object Repository/Demoshop/Page_DemoShop/button_Direct payment'))
				
				switch (bank.toString()) {
					
					case 'bank1':
					
						WebUI.click(findTestObject('Object Repository/Demoshop/Page_DemoShop/bank1'))
					
						WebUI.setText(findTestObject('Object Repository/Bank 1/Page_Log in - BankSystem/Email'), email)
											
						WebUI.setText(findTestObject('Object Repository/Bank 1/Page_Log in - BankSystem/Password'), password)
						
						WebUI.click(findTestObject('Object Repository/Bank 1/Page_Log in - BankSystem/button_Log in'))
											
						WebUI.delay(10)
					
						WebUI.click(findTestObject('Object Repository/test/Page_DemoShop/a_DemoShop'))
					
						WebUI.closeBrowser()
					
					break
					
					case 'bank2':
					
						WebUI.click(findTestObject('Object Repository/Demoshop/Page_DemoShop/bank2'))
					
						WebUI.setText(findTestObject('Object Repository/Bank 1/Page_Log in - BankSystem/Email'), email)
											
						WebUI.setText(findTestObject('Object Repository/Bank 1/Page_Log in - BankSystem/Password'), password)
						
						WebUI.click(findTestObject('Object Repository/Bank 1/Page_Log in - BankSystem/button_Log in'))
											
						WebUI.delay(10)
					
						WebUI.click(findTestObject('Object Repository/test/Page_DemoShop/a_DemoShop'))
					
						WebUI.closeBrowser()
					
					
					break	
					
				}
					
			break
			
		 }

		break
		
		case 'mouse':
		
		WebUI.click(findTestObject('Object Repository/Demoshop/Page_DemoShop/button_Buy now2'))
		
		switch (payment.toString()) {
			
			case 'card':
			
				WebUI.click(findTestObject('Demoshop/Page_DemoShop/button_Pay by card'))
			
				WebUI.setText(findTestObject('Demoshop/Page_DemoShop/Card number'), cardnumber)
			
				WebUI.setText(findTestObject('Demoshop/Page_DemoShop/Cardholder name'), cardholder)
			
				WebUI.setText(findTestObject('Demoshop/Page_DemoShop/ExpiryDate'), expired)
			
				WebUI.setText(findTestObject('Demoshop/Page_DemoShop/security code'), security)
			
				WebUI.click(findTestObject('Demoshop/Page_DemoShop/button_Pay'))
			
				WebUI.click(findTestObject('Demoshop/Page_DemoShop/a_DemoShop'))
			
			break
			
			case 'direct':
			
				WebUI.click(findTestObject('Object Repository/Demoshop/Page_DemoShop/button_Direct payment'))
				
				switch (bank.toString()) {
					
					case 'bank1':
					
						WebUI.click(findTestObject('Object Repository/Demoshop/Page_DemoShop/bank1'))
					
						WebUI.setText(findTestObject('Object Repository/Bank 1/Page_Log in - BankSystem/Email'), email)
											
						WebUI.setText(findTestObject('Object Repository/Bank 1/Page_Log in - BankSystem/Password'), password)
						
						WebUI.click(findTestObject('Object Repository/Bank 1/Page_Log in - BankSystem/button_Log in'))
											
						WebUI.delay(10)
					
						WebUI.click(findTestObject('Object Repository/test/Page_DemoShop/a_DemoShop'))
					
						WebUI.closeBrowser()
					
					break
					
					case 'bank2':
					
						WebUI.click(findTestObject('Object Repository/Demoshop/Page_DemoShop/bank2'))
					
						WebUI.setText(findTestObject('Object Repository/Bank 1/Page_Log in - BankSystem/Email'), email)
											
						WebUI.setText(findTestObject('Object Repository/Bank 1/Page_Log in - BankSystem/Password'), password)
						
						WebUI.click(findTestObject('Object Repository/Bank 1/Page_Log in - BankSystem/button_Log in'))
											
						WebUI.delay(10)
					
						WebUI.click(findTestObject('Object Repository/test/Page_DemoShop/a_DemoShop'))
					
						WebUI.closeBrowser()
					
					
					break
					
				}
					
			break
			
		 }
	
		break
		
		case 'headphone':
		
		WebUI.click(findTestObject('Object Repository/Demoshop/Page_DemoShop/button_Buy now3'))
		
		switch (payment.toString()) {
			
			case 'card':
			
				WebUI.click(findTestObject('Demoshop/Page_DemoShop/button_Pay by card'))
			
				WebUI.setText(findTestObject('Demoshop/Page_DemoShop/Card number'), cardnumber)
			
				WebUI.setText(findTestObject('Demoshop/Page_DemoShop/Cardholder name'), cardholder)
			
				WebUI.setText(findTestObject('Demoshop/Page_DemoShop/ExpiryDate'), expired)
			
				WebUI.setText(findTestObject('Demoshop/Page_DemoShop/security code'), security)
			
				WebUI.click(findTestObject('Demoshop/Page_DemoShop/button_Pay'))
			
				WebUI.click(findTestObject('Demoshop/Page_DemoShop/a_DemoShop'))
			
			break
			
			case 'direct':
			
				WebUI.click(findTestObject('Object Repository/Demoshop/Page_DemoShop/button_Direct payment'))
				
				switch (bank.toString()) {
					
					case 'bank1':
					
						WebUI.click(findTestObject('Object Repository/Demoshop/Page_DemoShop/bank1'))
					
						WebUI.setText(findTestObject('Object Repository/Bank 1/Page_Log in - BankSystem/Email'), email)
											
						WebUI.setText(findTestObject('Object Repository/Bank 1/Page_Log in - BankSystem/Password'), password)
						
						WebUI.click(findTestObject('Object Repository/Bank 1/Page_Log in - BankSystem/button_Log in'))
											
						WebUI.delay(10)
					
						WebUI.click(findTestObject('Object Repository/test/Page_DemoShop/a_DemoShop'))
					
						WebUI.closeBrowser()
					
					break
					
					case 'bank2':
					
						WebUI.click(findTestObject('Object Repository/Demoshop/Page_DemoShop/bank2'))
					
						WebUI.setText(findTestObject('Object Repository/Bank 1/Page_Log in - BankSystem/Email'), email)
											
						WebUI.setText(findTestObject('Object Repository/Bank 1/Page_Log in - BankSystem/Password'), password)
						
						WebUI.click(findTestObject('Object Repository/Bank 1/Page_Log in - BankSystem/button_Log in'))
											
						WebUI.delay(10)
					
						WebUI.click(findTestObject('Object Repository/test/Page_DemoShop/a_DemoShop'))
					
						WebUI.closeBrowser()
					
					
					break
					
				}
					
			break
			
		 }
		
		break
	
	
}