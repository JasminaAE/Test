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

WebUI.click(findTestObject('DetailsOfItem/Page_ACME ECOMM  Home/a_Books'))

WebUI.click(findTestObject('DetailsOfItem/Page_ACME ECOMM  Books/a_Biographies'))

WebUI.click(findTestObject('DetailsOfItem/Page_ACME ECOMM  BooksBiographies/b_The Story of my Life'))

WebUI.verifyElementPresent(findTestObject('DetailsOfItem/Page_ACME ECOMM  Books/b_Author'), 0)

WebUI.verifyElementPresent(findTestObject('DetailsOfItem/Page_ACME ECOMM  Books/b_Publisher'), 0)

WebUI.verifyElementPresent(findTestObject('DetailsOfItem/Page_ACME ECOMM  Books/b_ISBN'), 0)

WebUI.verifyElementPresent(findTestObject('DetailsOfItem/Page_ACME ECOMM  Books/Image'), 0)

WebUI.verifyElementPresent(findTestObject('DetailsOfItem/Page_ACME ECOMM  Books/Price'), 0)

'Description has to be displayed in Product details ID R3'
WebUI.verifyTextPresent('Description', true)

WebUI.click(findTestObject('DetailsOfItem/Page_ACME ECOMM  Books/a_Back to Product List'))

WebUI.click(findTestObject('DetailsOfItem/Page_ACME ECOMM  BooksBiographies/img'))

WebUI.closeBrowser()

