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

WebUI.click(findTestObject('Bank 1/Page_Home Page - BankSystem/profle dropdown'))

WebUI.click(findTestObject('Bank 1/Page_Home Page - BankSystem/Settings'))

WebUI.click(findTestObject('Bank 1/Page_Change password - BankSystem/Change password'))

WebUI.setText(findTestObject('Bank 1/Page_Change password - BankSystem/input_Current password'), 
    pass)

WebUI.setEncryptedText(findTestObject('Bank 1/Page_Change password - BankSystem/input_New password'), passnew)

WebUI.setEncryptedText(findTestObject('Bank 1/Page_Change password - BankSystem/input_Confirm new password'), 
    confirmpassnew)

WebUI.click(findTestObject('Bank 1/Page_Change password - BankSystem/button_Change password'))

WebUI.click(findTestObject('Bank 1/Page_Change password - BankSystem/close topup change password'))

WebUI.closeBrowser()

