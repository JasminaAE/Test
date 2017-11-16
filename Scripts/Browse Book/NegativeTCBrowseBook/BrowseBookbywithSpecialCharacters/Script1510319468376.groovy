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

WebUI.maximizeWindow()

WebUI.navigateToUrl('http://www.acme.qualityhouse.bg/build3/index.php')

WebUI.click(findTestObject('BrowsewithsSpecialCharacter/Page_ACME ECOMM  Home/a_Books'))

WebUI.click(findTestObject('BrowsewithsSpecialCharacter/Page_ACME ECOMM  Books/td_Author'))

WebUI.setText(findTestObject('BrowsewithsSpecialCharacter/Page_ACME ECOMM  Books/input_Author'), '%')

WebUI.click(findTestObject('BrowsewithsSpecialCharacter/Page_ACME ECOMM  Books/input_formbtn'))

WebUI.click(findTestObject('BrowsewithsSpecialCharacter/Page_ACME ECOMM  Books/a_add to basket'))

'This test case fail. Expeced result with search input  % do not match any book and the message "There are no Books matching the search criteria..." has to be displayed. Actual result showing all books from Books category.'
WebUI.verifyTextPresent('There are no Books matching the search criteria...', true)

WebUI.closeBrowser()

