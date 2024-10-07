import truetest.common.addNewEmployeeInHRPortal
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.configuration.RunConfiguration
import truetest.common.loginToHRPortal
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import truetest.custom.TrueTestScripts

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to /web/index.php/auth/login"

TrueTestScripts.navigate("/web/index.php/auth/login")

"Step 2: Click on div LoginCredentials"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/web/index.php/auth/login?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_web_index_php_auth_login/div_LoginCredentials'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 2-Click on div LoginCredentials.png')

"Step 3: Log in to the HR portal using credentials"

loginToHRPortal.execute(data_path_0, Integer.valueOf(index_0))

"Step 4: Add a new employee in the HR portal"

addNewEmployeeInHRPortal.execute(data_path_1, Integer.valueOf(index_1))

"Step 5: Click on link EmployeeList -> Navigate to page '/web/index.php/pim/viewEmployeeList'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/web/index.php/pim/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_web_index_php_pim_viewPersonalDetails_empNumber/link_EmployeeList'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 5-Click on link EmployeeList - Navigate to page webindexphppimviewEmployeeList.png')

"Step 6: Click on input HintSearch"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/web/index.php/pim/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_web_index_php_pim_viewEmployeeList/input_HintSearch'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 6-Click on input HintSearch.png')

"Step 7: Enter input value in input HintSearch"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/web/index.php/pim/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_web_index_php_pim_viewEmployeeList/input_HintSearch'), input_HintSearch)

WebUI.takeScreenshot(reportLocation + '/TC1/Step 7-Enter input value in input HintSearch.png')

"Step 8: Click on button Search"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/web/index.php/pim/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_web_index_php_pim_viewEmployeeList/button_Search'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 8-Click on button Search.png')

"Step 9: Click on button Action"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/web/index.php/pim/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_web_index_php_pim_viewEmployeeList/button_Action'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 9-Click on button Action.png')

"Step 10: Click on button YesDelete -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/web/index.php/pim/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_web_index_php_pim_viewEmployeeList/button_YesDelete'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 10-Click on button YesDelete - Navigate to page .png')

"Step 11: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC1-Add and Delete Employee in HR Portal_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}