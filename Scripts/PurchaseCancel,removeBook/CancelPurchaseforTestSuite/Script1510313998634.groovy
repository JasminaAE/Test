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

WebUI.openBrowser('http://www.acme.qualityhouse.bg/build3/index.php')

WebUI.click(findTestObject('EditProfile/Page_ACME ECOMM  Home/a_Login'))

CustomKeywords.'com.acme.login.loginForm.Login'('student2', 'stpass2')

WebUI.click(findTestObject('AcmeLogin/input_ses_login'))

WebUI.click(findTestObject('PurchaseBook/a_Books'))

WebUI.click(findTestObject('BookArtDetail/a_Art'))

WebUI.click(findTestObject('cancel purchase/Page_ACME ECOMM  BooksBiographies/a_add to basket'))

WebUI.click(findTestObject('cancel purchase/Page_ACME ECOMM  BooksBiographies/a_Basket'))

WebUI.click(findTestObject('PurchaseBook/a_Checkout'))

WebUI.acceptAlert()

WebUI.click(findTestObject('cancel purchase/Page_ACME ECOMM  Checkout/a_Cancel Purchase'))

WebUI.acceptAlert()

'Page is misssing, error message is displayed.That is the reason why this test fail.'
WebUI.verifyTextPresent('Home', true)

WebUI.closeBrowser()

