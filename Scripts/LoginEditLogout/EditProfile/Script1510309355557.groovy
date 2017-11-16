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

WebUI.click(findTestObject('EditProfile/Page_ACME ECOMM  Home/a_Login'))

WebUI.setText(findTestObject('EditProfile/Page_ACME ECOMM  Login/input_username'), 'student1')

WebUI.setText(findTestObject('EditProfile/Page_ACME ECOMM  Login/input_userpass'), 'stpass1')

WebUI.click(findTestObject('EditProfile/Page_ACME ECOMM  Login/input_ses_login'))

WebUI.click(findTestObject('EditProfile/Page_ACME ECOMM  Home/a_Edit Profile'))

WebUI.click(findTestObject('EditProfile/Page_ACME ECOMM  Edit Profile/div_out-wrapper'))

WebUI.setText(findTestObject('EditProfile/Page_ACME ECOMM  Edit Profile/input_cEmail'), 'nem11@gmail.com')

WebUI.setText(findTestObject('EditProfile/Page_ACME ECOMM  Edit Profile/Page_ACME ECOMM  Edit Profile/input_cName'), 'Ivan')

WebUI.setText(findTestObject('EditProfile/Page_ACME ECOMM  Edit Profile/Page_ACME ECOMM  Edit Profile/input_cPhone'), '060147258')

WebUI.setText(findTestObject('EditProfile/Page_ACME ECOMM  Edit Profile/Page_ACME ECOMM  Edit Profile/textarea_Sencanska'), 
    'Sencanska')

WebUI.click(findTestObject('EditProfile/Page_ACME ECOMM  Edit Profile/submit button edit'))

WebUI.verifyElementText(findTestObject('EditProfile/Page_ACME ECOMM  Edit Profile/b_Your profile was updated suc'), 'Your profile was updated successfully!')

WebUI.closeBrowser()

