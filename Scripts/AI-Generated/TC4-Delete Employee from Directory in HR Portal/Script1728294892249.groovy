import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.configuration.RunConfiguration
import truetest.common.loginToHRPortal
import internal.GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
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

WebUI.takeScreenshot(reportLocation + '/TC4/Step 2-Click on div LoginCredentials.png')

"Step 3: Click on div LoginCredentials"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/web/index.php/auth/login?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_web_index_php_auth_login/div_LoginCredentials'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 3-Click on div LoginCredentials.png')

"Step 4: Click on div LoginCredentials"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/web/index.php/auth/login?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_web_index_php_auth_login/div_LoginCredentials'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 4-Click on div LoginCredentials.png')

"Step 5: Log in to the HR portal using credentials"

loginToHRPortal.execute(data_path_0, Integer.valueOf(index_0))

"Step 6: Click on link Directory -> Navigate to page '/web/index.php/directory/viewDirectory'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/web/index.php/dashboard/index?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_web_index_php_dashboard_index/link_Directory'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 6-Click on link Directory - Navigate to page webindexphpdirectoryviewDirectory.png')

"Step 7: Click on input HintSearch"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/web/index.php/directory/viewDirectory?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_web_index_php_directory_viewDirectory/input_HintSearch'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 7-Click on input HintSearch.png')

"Step 8: Enter input value in input HintSearch"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/web/index.php/directory/viewDirectory?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_web_index_php_directory_viewDirectory/input_HintSearch'), input_HintSearch)

WebUI.takeScreenshot(reportLocation + '/TC4/Step 8-Enter input value in input HintSearch.png')

"Step 9: Click on button Search"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/web/index.php/directory/viewDirectory?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_web_index_php_directory_viewDirectory/button_Search'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 9-Click on button Search.png')

"Step 10: Click on div DirectorySheet"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/web/index.php/directory/viewDirectory?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_web_index_php_directory_viewDirectory/div_DirectorySheet'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 10-Click on div DirectorySheet.png')

"Step 11: Click on i DirectoryIcon"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/web/index.php/directory/viewDirectory?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_web_index_php_directory_viewDirectory/i_DirectoryIcon'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 11-Click on i DirectoryIcon.png')

"Step 12: Click on link PIM -> Navigate to page '/web/index.php/pim/viewEmployeeList'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/web/index.php/directory/viewDirectory?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_web_index_php_directory_viewDirectory/link_PIM'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 12-Click on link PIM - Navigate to page webindexphppimviewEmployeeList.png')

"Step 13: Click on input HintSearch"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/web/index.php/pim/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_web_index_php_pim_viewEmployeeList/input_HintSearch'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 13-Click on input HintSearch.png')

"Step 14: Enter input value in input HintSearch"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/web/index.php/pim/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_web_index_php_pim_viewEmployeeList/input_HintSearch'), input_HintSearch)

WebUI.takeScreenshot(reportLocation + '/TC4/Step 14-Enter input value in input HintSearch.png')

"Step 15: Click on button Search"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/web/index.php/pim/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_web_index_php_pim_viewEmployeeList/button_Search'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 15-Click on button Search.png')

"Step 16: Click on button Action"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/web/index.php/pim/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_web_index_php_pim_viewEmployeeList/button_Action'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 16-Click on button Action.png')

"Step 17: Click on button YesDelete -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/web/index.php/pim/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_web_index_php_pim_viewEmployeeList/button_YesDelete'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 17-Click on button YesDelete - Navigate to page .png')

"Step 18: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC4-Delete Employee from Directory in HR Portal_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}