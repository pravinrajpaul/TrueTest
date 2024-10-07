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

WebUI.takeScreenshot(reportLocation + '/TC2/Step 2-Click on div LoginCredentials.png')

"Step 3: Log in to the HR portal using credentials"

loginToHRPortal.execute(data_path_0, Integer.valueOf(index_0))

"Step 4: Add a new employee in the HR portal"

addNewEmployeeInHRPortal.execute(data_path_1, Integer.valueOf(index_1))

"Step 5: Click on link Directory -> Navigate to page '/web/index.php/directory/viewDirectory'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/web/index.php/pim/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_web_index_php_pim_viewPersonalDetails_empNumber/link_Directory'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 5-Click on link Directory - Navigate to page webindexphpdirectoryviewDirectory.png')

"Step 6: Click on input HintSearch"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/web/index.php/directory/viewDirectory?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_web_index_php_directory_viewDirectory/input_HintSearch'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 6-Click on input HintSearch.png')

"Step 7: Enter input value in input HintSearch"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/web/index.php/directory/viewDirectory?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_web_index_php_directory_viewDirectory/input_HintSearch'), input_HintSearch)

WebUI.takeScreenshot(reportLocation + '/TC2/Step 7-Enter input value in input HintSearch.png')

"Step 8: Click on button Search -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/web/index.php/directory/viewDirectory?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_web_index_php_directory_viewDirectory/button_Search'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 8-Click on button Search - Navigate to page .png')

"Step 9: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC2-Add Employee and Search in Directory_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}