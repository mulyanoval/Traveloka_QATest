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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.traveloka.com/en-id')

WebUI.click(findTestObject('Object Repository/Traveloka Car/Page_Traveloka - Southeast Asias Leading Tr_13aaf0/div_Log In'))

WebUI.setText(findTestObject('Object Repository/Traveloka Car/Page_Traveloka - Southeast Asias Leading Tr_13aaf0/input_css-11aywtz r-cwxd7f r-13awgt0 r-t1w4_34ae4c'), 
    'mulyanovaln@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Traveloka Car/Page_Traveloka - Southeast Asias Leading Tr_13aaf0/input_css-11aywtz r-cwxd7f r-13awgt0 r-t1w4_34ae4c_1'), 
    'A8OGLYMEb3pPaEl7GxAK/w==')

WebUI.click(findTestObject('Object Repository/Traveloka Car/Page_Traveloka - Southeast Asias Leading Tr_13aaf0/div_Log In_Orange'))

WebUI.delay(30 // for input verification code from email manually
    )

WebUI.click(findTestObject('Object Repository/Traveloka Car/Page_Traveloka - Southeast Asias Leading Tr_13aaf0/h4_Car Rental'))

//WebUI.delay(10)
WebUI.doubleClick(findTestObject('Object Repository/Traveloka Car/Page_Cheapest Car Rental from Rp200kday  Se_936f97/input_css-11aywtz r-z2wwpe r-t1w4ow r-1b43r_2162d1'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Traveloka Car/Page_Cheapest Car Rental from Rp200kday  Se_936f97/input_css-11aywtz r-z2wwpe r-t1w4ow r-1b43r_2162d1'), 
    10)

WebUI.setText(findTestObject('Object Repository/Traveloka Car/Page_Cheapest Car Rental from Rp200kday  Se_936f97/input_css-11aywtz r-z2wwpe r-t1w4ow r-1b43r_2162d1'), 
    'jakarta')

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Traveloka Car/Page_Cheapest Car Rental from Rp200kday  Se_936f97/h3_Jakarta'))

WebUI.click(findTestObject('Object Repository/Traveloka Car/Page_Cheapest Car Rental from Rp200kday  Se_936f97/input_css-11aywtz r-z2wwpe r-t1w4ow r-1b43r_2162d1_1'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Traveloka Car/Page_Cheapest Car Rental from Rp200kday  Se_936f97/div_26'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Traveloka Car/Page_Cheapest Car Rental from Rp200kday  Se_936f97/input_css-StartTime'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Traveloka Car/Page_Cheapest Car Rental from Rp200kday  Se_936f97/div_9'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Traveloka Car/Page_Cheapest Car Rental from Rp200kday  Se_936f97/div_0'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Traveloka Car/Page_Cheapest Car Rental from Rp200kday  Se_936f97/div_Done'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Traveloka Car/Page_Cheapest Car Rental from Rp200kday  Se_936f97/input_css-EndDate'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Traveloka Car/Page_Cheapest Car Rental from Rp200kday  Se_936f97/div_29'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Traveloka Car/Page_Cheapest Car Rental from Rp200kday  Se_936f97/input_css-EndTime'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Traveloka Car/Page_Cheapest Car Rental from Rp200kday  Se_936f97/div_11'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Traveloka Car/Page_Cheapest Car Rental from Rp200kday  Se_936f97/div_0'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Traveloka Car/Page_Cheapest Car Rental from Rp200kday  Se_936f97/div_Done_EndTime'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Traveloka Car/Page_Cheapest Car Rental from Rp200kday  Se_936f97/div_Search Car'))

WebUI.click(findTestObject('Object Repository/Traveloka Car/Page_Cheapest Car Rental from Rp200kday Wit_6af24f/div_Continue'))

WebUI.click(findTestObject('Object Repository/Traveloka Car/Page_Cheapest Car Rental from Rp200kday Wit_6af24f/div_Continue2'))

WebUI.waitForElementVisible(findTestObject('Traveloka Car/Page_Cheapest Car Rental from Rp200kday Wit_6af24f/div_css-1dbjc4n r-1naam9t r-1fuqb1j r-d045u_325a59'), 
    5)

WebUI.click(findTestObject('Object Repository/Traveloka Car/Page_Cheapest Car Rental from Rp200kday Wit_6af24f/div_css-1dbjc4n r-1naam9t r-1fuqb1j r-d045u_325a59'))

WebUI.waitForElementVisible(findTestObject('Traveloka Car/Page_Cheapest Car Rental from Rp200kday Wit_6af24f/div_Rental Office'), 
    5)

WebUI.click(findTestObject('Object Repository/Traveloka Car/Page_Cheapest Car Rental from Rp200kday Wit_6af24f/div_Rental Office'))

WebUI.waitForElementVisible(findTestObject('Traveloka Car/Page_Cheapest Car Rental from Rp200kday Wit_6af24f/div_css-1dbjc4n r-1q9bdsx r-d045u9 r-tbmifm_c9da47'), 
    5)

WebUI.click(findTestObject('Object Repository/Traveloka Car/Page_Cheapest Car Rental from Rp200kday Wit_6af24f/div_css-1dbjc4n r-1q9bdsx r-d045u9 r-tbmifm_c9da47'))

WebUI.waitForElementVisible(findTestObject('Traveloka Car/Page_Cheapest Car Rental from Rp200kday Wit_6af24f/div_css-1dbjc4n r-1q9bdsx r-d045u9 r-tbmifm_c9da47_1'), 
    5)

WebUI.click(findTestObject('Object Repository/Traveloka Car/Page_Cheapest Car Rental from Rp200kday Wit_6af24f/div_css-1dbjc4n r-1q9bdsx r-d045u9 r-tbmifm_c9da47_1'))

//WebUI.delay(5) // wait for drop-off location done loading
WebUI.waitForElementVisible(findTestObject('Object Repository/Traveloka Car/Page_Cheapest Car Rental from Rp200kday Wit_6af24f/input_css-11aywtz r-z2wwpe r-t1w4ow r-1b43r_2162d1'), 
    5)

WebUI.setText(findTestObject('Object Repository/Traveloka Car/Page_Cheapest Car Rental from Rp200kday Wit_6af24f/input_css-11aywtz r-z2wwpe r-t1w4ow r-1b43r_2162d1'), 
    'plaza senayan')

WebUI.click(findTestObject('Object Repository/Traveloka Car/Page_Cheapest Car Rental from Rp200kday Wit_6af24f/span_Plaza Senayan'))

WebUI.setText(findTestObject('Object Repository/Traveloka Car/Page_Cheapest Car Rental from Rp200kday Wit_6af24f/textarea_M'), 
    'M')

WebUI.setText(findTestObject('Object Repository/Traveloka Car/Page_Cheapest Car Rental from Rp200kday Wit_6af24f/textarea_Me'), 
    'Me')

WebUI.setText(findTestObject('Object Repository/Traveloka Car/Page_Cheapest Car Rental from Rp200kday Wit_6af24f/textarea_Mee'), 
    'Mee')

WebUI.setText(findTestObject('Object Repository/Traveloka Car/Page_Cheapest Car Rental from Rp200kday Wit_6af24f/textarea_Meet'), 
    'Meet')

WebUI.setText(findTestObject('Object Repository/Traveloka Car/Page_Cheapest Car Rental from Rp200kday Wit_6af24f/textarea_Meet_1'), 
    'Meet ')

WebUI.setText(findTestObject('Object Repository/Traveloka Car/Page_Cheapest Car Rental from Rp200kday Wit_6af24f/textarea_Meet a'), 
    'Meet a')

WebUI.setText(findTestObject('Object Repository/Traveloka Car/Page_Cheapest Car Rental from Rp200kday Wit_6af24f/textarea_Meet at'), 
    'Meet at')

WebUI.setText(findTestObject('Object Repository/Traveloka Car/Page_Cheapest Car Rental from Rp200kday Wit_6af24f/textarea_Meet at_1'), 
    'Meet at ')

WebUI.setText(findTestObject('Object Repository/Traveloka Car/Page_Cheapest Car Rental from Rp200kday Wit_6af24f/textarea_Meet at t'), 
    'Meet at t')

WebUI.setText(findTestObject('Object Repository/Traveloka Car/Page_Cheapest Car Rental from Rp200kday Wit_6af24f/textarea_Meet at th'), 
    'Meet at th')

WebUI.setText(findTestObject('Object Repository/Traveloka Car/Page_Cheapest Car Rental from Rp200kday Wit_6af24f/textarea_Meet at the'), 
    'Meet at the')

WebUI.setText(findTestObject('Object Repository/Traveloka Car/Page_Cheapest Car Rental from Rp200kday Wit_6af24f/textarea_Meet at the_1'), 
    'Meet at the ')

WebUI.setText(findTestObject('Object Repository/Traveloka Car/Page_Cheapest Car Rental from Rp200kday Wit_6af24f/textarea_Meet at the p'), 
    'Meet at the p')

WebUI.setText(findTestObject('Object Repository/Traveloka Car/Page_Cheapest Car Rental from Rp200kday Wit_6af24f/textarea_Meet at the pa'), 
    'Meet at the pa')

WebUI.setText(findTestObject('Object Repository/Traveloka Car/Page_Cheapest Car Rental from Rp200kday Wit_6af24f/textarea_Meet at the par'), 
    'Meet at the par')

WebUI.setText(findTestObject('Object Repository/Traveloka Car/Page_Cheapest Car Rental from Rp200kday Wit_6af24f/textarea_Meet at the park'), 
    'Meet at the park')

WebUI.setText(findTestObject('Object Repository/Traveloka Car/Page_Cheapest Car Rental from Rp200kday Wit_6af24f/textarea_Meet at the parki'), 
    'Meet at the parki')

WebUI.setText(findTestObject('Object Repository/Traveloka Car/Page_Cheapest Car Rental from Rp200kday Wit_6af24f/textarea_Meet at the parkin'), 
    'Meet at the parkin')

WebUI.setText(findTestObject('Object Repository/Traveloka Car/Page_Cheapest Car Rental from Rp200kday Wit_6af24f/textarea_Meet at the parking'), 
    'Meet at the parking')

WebUI.setText(findTestObject('Object Repository/Traveloka Car/Page_Cheapest Car Rental from Rp200kday Wit_6af24f/textarea_Meet at the parking_1'), 
    'Meet at the parking ')

WebUI.setText(findTestObject('Object Repository/Traveloka Car/Page_Cheapest Car Rental from Rp200kday Wit_6af24f/textarea_Meet at the parking l'), 
    'Meet at the parking l')

WebUI.setText(findTestObject('Object Repository/Traveloka Car/Page_Cheapest Car Rental from Rp200kday Wit_6af24f/textarea_Meet at the parking lo'), 
    'Meet at the parking lo')

WebUI.setText(findTestObject('Object Repository/Traveloka Car/Page_Cheapest Car Rental from Rp200kday Wit_6af24f/textarea_Meet at the parking lot'), 
    'Meet at the parking lot')

WebUI.setText(findTestObject('Object Repository/Traveloka Car/Page_Cheapest Car Rental from Rp200kday Wit_6af24f/textarea_Meet at the parking lot_1'), 
    'Meet at the parking lot.')

WebUI.click(findTestObject('Object Repository/Traveloka Car/Page_Cheapest Car Rental from Rp200kday Wit_6af24f/div_Continue'))

WebUI.click(findTestObject('Object Repository/Traveloka Car/Page_Traveloka - Southeast Asias Leading Tr_13aaf0/canvas-orm-012-991'))

WebUI.click(findTestObject('Object Repository/Traveloka Car/Page_Traveloka - Southeast Asias Leading Tr_13aaf0/canvas-orm-012-991'))

WebUI.click(findTestObject('Object Repository/Traveloka Car/Page_Traveloka - Southeast Asias Leading Tr_13aaf0/canvas-orm-012-991'))

WebUI.click(findTestObject('Object Repository/Traveloka Car/Page_Traveloka - Southeast Asias Leading Tr_13aaf0/canvas-orm-012-991'))

WebUI.click(findTestObject('Object Repository/Traveloka Car/Page_Traveloka - Southeast Asias Leading Tr_13aaf0/canvas-orm-012-991'))

WebUI.click(findTestObject('Object Repository/Traveloka Car/Page_Traveloka - Southeast Asias Leading Tr_13aaf0/button_Confirm-orm-012-902'))

WebUI.setText(findTestObject('Object Repository/Traveloka Car/Page_Traveloka - Southeast Asias Leading Tr_13aaf0/input_css-11aywtz r-13awgt0 r-t1w4ow r-ubez_3265a0'), 
    'Mulya Noval N')

WebUI.setText(findTestObject('Object Repository/Traveloka Car/Page_Traveloka - Southeast Asias Leading Tr_13aaf0/input_css-11aywtz r-13awgt0 r-t1w4ow r-ubez_065cb9'), 
    '81292265877')

WebUI.setText(findTestObject('Object Repository/Traveloka Car/Page_Traveloka - Southeast Asias Leading Tr_13aaf0/input_css-11aywtz r-13awgt0 r-t1w4ow r-ubez_3265a0'), 
    'mulyanovaln@gmail.com')

WebUI.click(findTestObject('Object Repository/Traveloka Car/Page_Traveloka - Southeast Asias Leading Tr_13aaf0/div_Save'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Traveloka Car/Page_Traveloka - Southeast Asias Leading Tr_13aaf0/select_Mr.Mrs.Ms'), 
    'MR', true)

WebUI.setText(findTestObject('Object Repository/Traveloka Car/Page_Traveloka - Southeast Asias Leading Tr_13aaf0/input_css-11aywtz r-13awgt0 r-t1w4ow r-ubez_3265a0'), 
    'Mulya Noval N')

WebUI.setText(findTestObject('Object Repository/Traveloka Car/Page_Traveloka - Southeast Asias Leading Tr_13aaf0/input_css-11aywtz r-13awgt0 r-t1w4ow r-ubez_065cb9'), 
    '81292265877')

WebUI.click(findTestObject('Object Repository/Traveloka Car/Page_Traveloka - Southeast Asias Leading Tr_13aaf0/div_Save'))

WebUI.click(findTestObject('Object Repository/Traveloka Car/Page_Traveloka - Southeast Asias Leading Tr_13aaf0/div_Continue'))

WebUI.setText(findTestObject('Object Repository/Traveloka Car/Page_Traveloka - Southeast Asias Leading Tr_13aaf0/textarea_I'), 
    'I')

WebUI.setText(findTestObject('Object Repository/Traveloka Car/Page_Traveloka - Southeast Asias Leading Tr_13aaf0/textarea_In'), 
    'In')

WebUI.setText(findTestObject('Object Repository/Traveloka Car/Page_Traveloka - Southeast Asias Leading Tr_13aaf0/textarea_Inf'), 
    'Inf')

WebUI.setText(findTestObject('Object Repository/Traveloka Car/Page_Traveloka - Southeast Asias Leading Tr_13aaf0/textarea_Infl'), 
    'Infl')

WebUI.setText(findTestObject('Object Repository/Traveloka Car/Page_Traveloka - Southeast Asias Leading Tr_13aaf0/textarea_Infla'), 
    'Infla')

WebUI.setText(findTestObject('Object Repository/Traveloka Car/Page_Traveloka - Southeast Asias Leading Tr_13aaf0/textarea_Inflat'), 
    'Inflat')

WebUI.setText(findTestObject('Object Repository/Traveloka Car/Page_Traveloka - Southeast Asias Leading Tr_13aaf0/textarea_Inflate'), 
    'Inflate')

WebUI.setText(findTestObject('Object Repository/Traveloka Car/Page_Traveloka - Southeast Asias Leading Tr_13aaf0/textarea_Inflate_1'), 
    'Inflate ')

WebUI.setText(findTestObject('Object Repository/Traveloka Car/Page_Traveloka - Southeast Asias Leading Tr_13aaf0/textarea_Inflate t'), 
    'Inflate t')

WebUI.setText(findTestObject('Object Repository/Traveloka Car/Page_Traveloka - Southeast Asias Leading Tr_13aaf0/textarea_Inflate th'), 
    'Inflate th')

WebUI.setText(findTestObject('Object Repository/Traveloka Car/Page_Traveloka - Southeast Asias Leading Tr_13aaf0/textarea_Inflate the'), 
    'Inflate the')

WebUI.setText(findTestObject('Object Repository/Traveloka Car/Page_Traveloka - Southeast Asias Leading Tr_13aaf0/textarea_Inflate the_1'), 
    'Inflate the ')

WebUI.setText(findTestObject('Object Repository/Traveloka Car/Page_Traveloka - Southeast Asias Leading Tr_13aaf0/textarea_Inflate the t'), 
    'Inflate the t')

WebUI.setText(findTestObject('Object Repository/Traveloka Car/Page_Traveloka - Southeast Asias Leading Tr_13aaf0/textarea_Inflate the ti'), 
    'Inflate the ti')

WebUI.setText(findTestObject('Object Repository/Traveloka Car/Page_Traveloka - Southeast Asias Leading Tr_13aaf0/textarea_Inflate the tir'), 
    'Inflate the tir')

WebUI.setText(findTestObject('Object Repository/Traveloka Car/Page_Traveloka - Southeast Asias Leading Tr_13aaf0/textarea_Inflate the tire'), 
    'Inflate the tire')

WebUI.setText(findTestObject('Object Repository/Traveloka Car/Page_Traveloka - Southeast Asias Leading Tr_13aaf0/textarea_Inflate the tires'), 
    'Inflate the tires')

WebUI.setText(findTestObject('Object Repository/Traveloka Car/Page_Traveloka - Southeast Asias Leading Tr_13aaf0/textarea_Inflate the tires_1'), 
    'Inflate the tires.')

WebUI.click(findTestObject('Object Repository/Traveloka Car/Page_Traveloka - Southeast Asias Leading Tr_13aaf0/div_Tap to check the requirements'))

WebUI.click(findTestObject('Object Repository/Traveloka Car/Page_Traveloka - Southeast Asias Leading Tr_13aaf0/div_Check All'))

WebUI.click(findTestObject('Object Repository/Traveloka Car/Page_Traveloka - Southeast Asias Leading Tr_13aaf0/div_Save'))

WebUI.click(findTestObject('Object Repository/Traveloka Car/Page_Traveloka - Southeast Asias Leading Tr_13aaf0/div_Continue to Payment'))

WebUI.click(findTestObject('Object Repository/Traveloka Car/Page_Traveloka - Southeast Asias Leading Tr_13aaf0/div_Continue'))

WebUI.click(findTestObject('Object Repository/Traveloka Car/Page_Cheap Flights Tickets Traveloka - Onli_2df141/div_Bank Transfer'))

WebUI.click(findTestObject('Object Repository/Traveloka Car/Page_Cheap Flights Tickets Traveloka - Onli_2df141/div_BCA Transfer'))

WebUI.click(findTestObject('Object Repository/Traveloka Car/Page_Cheap Flights Tickets Traveloka - Onli_2df141/div_Pay with Bank Transfer'))

WebUI.closeBrowser()

