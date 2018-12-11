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
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.JavascriptExecutor as JavascriptExecutor
import org.openqa.selenium.Keys as Keys

    WebUI.openBrowser('')

    WebUI.navigateToUrl('http://store.demoqa.com/')

    WebUI.maximizeWindow()

    Thread.sleep(1000)

    'Click on Buy button'
    WebUI.click(findTestObject('Object Repository/Online_OR/span_Buy Now'))

    //Thread.sleep(1000)
    WebUI.waitForElementVisible(findTestObject('Object Repository/Online_OR/input_INR12000.00_Buy'), 10)

    WebUI.click(findTestObject('Object Repository/Online_OR/input_INR12000.00_Buy'))

    //Thread.sleep(1000)
    WebUI.waitForElementVisible(findTestObject('Object Repository/Online_OR/a_1 item  CartCheckout'), 10)

    'Click on checkout button'
    WebUI.click(findTestObject('Object Repository/Online_OR/a_1 item  CartCheckout'))

    WebUI.waitForElementVisible(findTestObject('Online_OR/continue'), 10)

    'Click on continue button'
    WebUI.click(findTestObject('Online_OR/continue'))

    'Wait execution'
    Thread.sleep(1000)

    'Scroll until  First name visible'
    WebUI.scrollToElement(findTestObject('Online_OR/firstname'), 20)

    'Enering First name data'
    WebUI.setText(findTestObject('Online_OR/firstname'), 'Srinu')

    'Entering Last name data'
    WebUI.setText(findTestObject('Online_OR/lastname'), 'g')

    'Enter Address'
    WebUI.setText(findTestObject('Online_OR/address'), 'hyderabad')

    WebUI.selectOptionByValue(findTestObject('Object Repository/Online_OR/select_Please select a country'), 'IN', true)

    'Enter City'
    WebUI.setText(findTestObject('Online_OR/city'), 'Vizag')

    'Enter State'
    WebUI.setText(findTestObject('Online_OR/state'), 'Andhra pradesh')

    'Select Country India'
    WebUI.setText(findTestObject('Online_OR/country'), 'IN')

    'Enter Phone'
    WebUI.setText(findTestObject('Online_OR/phone'), '1234567899')

    'Click on input same as billing address'
    WebUI.click(findTestObject('Object Repository/Online_OR/input_Same as billing address_'))

    'Enter Email'
    WebUI.setText(findTestObject('Online_OR/email'), 'TEST@gmail.com')

    'Clcik on Submit button'
    WebUI.click(findTestObject('Object Repository/Online_OR/input_Go Back_submit'))

    WebUI.verifyTextPresent('Thank you, your purchase is pending. You will be', true)

	
