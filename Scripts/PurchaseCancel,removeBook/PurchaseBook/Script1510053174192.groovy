import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('http://www.acme.qualityhouse.bg/build3/index.php')

WebUI.click(findTestObject('PurchaseBook/a_Books'))

WebUI.click(findTestObject('PurchaseBook/a_Art'))

WebUI.click(findTestObject('PurchaseBook/a_add to basket'))

WebUI.click(findTestObject('PurchaseBook/a_Basket (1)'))

WebUI.click(findTestObject('PurchaseBook/a_Checkout'))

WebUI.acceptAlert()

WebUI.setText(findTestObject('PurchaseBook/input_username'), 'student1')

WebUI.setText(findTestObject('PurchaseBook/input_userpass'), 'stpass1')

WebUI.click(findTestObject('PurchaseBook/input_ses_login'))

WebUI.click(findTestObject('PurchaseBook/a_Confirm Purchase'))

WebUI.acceptAlert()

WebUI.verifyTextPresent('Thank you for your purchase!', false)

WebUI.click(findTestObject('PurchaseBook/a_Go to Home page'))

