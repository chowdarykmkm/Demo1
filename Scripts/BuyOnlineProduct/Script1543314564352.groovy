import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('http://store.demoqa.com/')

WebUI.maximizeWindow()

'Click on Buy button'
WebUI.click(findTestObject('Object Repository/Online_OR/span_Buy Now'))

WebUI.click(findTestObject('Object Repository/Online_OR/input_INR12000.00_Buy'))

'Click on checkout button'
WebUI.click(findTestObject('Object Repository/Online_OR/a_1 item  CartCheckout'))

'Click on continue button'
WebUI.click(findTestObject('Online_OR/continue'))

'Wait execution'
Thread.sleep(1000)

'Scroll until  First name visible'
WebUI.scrollToElement(findTestObject('Online_OR/firstname'), 20)

'Enering First name data'
WebUI.setText(findTestObject('Online_OR/firstname'), findTestData('mydata').getValue(2, 1))

'Entering Last name data'
WebUI.setText(findTestObject('Online_OR/lastname'), findTestData('mydata').getValue(3, 1))

'Enter Address'
WebUI.setText(findTestObject('Online_OR/address'), 'myaddress')

WebUI.selectOptionByValue(findTestObject('Object Repository/Online_OR/select_Please select a country'), findTestData('mydata').getValue(
        6, 1), true)

'Enter City'
WebUI.setText(findTestObject('Online_OR/city'), findTestData('mydata').getValue(5, 1))

'Enter State'
WebUI.setText(findTestObject('Online_OR/state'), findTestData('mydata').getValue(7, 1))

'Select Country India'
WebUI.setText(findTestObject('Online_OR/country'), findTestData('mydata').getValue(8, 1))

'Enter Phone'
WebUI.setText(findTestObject('Online_OR/phone'), findTestData('mydata').getValue(9, 1))

'Click on input same as billing address'
WebUI.click(findTestObject('Object Repository/Online_OR/input_Same as billing address_'))

'Enter Email'
WebUI.setText(findTestObject('Online_OR/email'), findTestData('mydata').getValue(1, 1))

'Clcik on Submit button'
WebUI.click(findTestObject('Object Repository/Online_OR/input_Go Back_submit'))


