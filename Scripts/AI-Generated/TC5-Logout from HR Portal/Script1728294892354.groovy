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

WebUI.takeScreenshot(reportLocation + '/TC5/Step 2-Click on div LoginCredentials.png')

"Step 3: Log in to the HR portal using credentials"

loginToHRPortal.execute(data_path_0, Integer.valueOf(index_0))

"Step 4: Click on i UserIcon"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/web/index.php/dashboard/index?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_web_index_php_dashboard_index/i_UserIcon'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 4-Click on i UserIcon.png')

"Step 5: Click on link Logout -> Navigate to page '/web/index.php/auth/login'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/web/index.php/dashboard/index?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_web_index_php_dashboard_index/link_Logout'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 5-Click on link Logout - Navigate to page webindexphpauthlogin.png')

"Step 6: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC5-Logout from HR Portal_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}