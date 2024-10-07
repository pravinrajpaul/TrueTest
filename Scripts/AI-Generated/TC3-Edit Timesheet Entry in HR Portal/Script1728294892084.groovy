import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.common.loginToHRPortal
import com.kms.katalon.core.configuration.RunConfiguration
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

"Step 2: Log in to the HR portal using credentials"

loginToHRPortal.execute(data_path_0, Integer.valueOf(index_0))

"Step 3: Click on button MyTimesheet -> Navigate to page '/web/index.php/time/viewMyTimesheet'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/web/index.php/dashboard/index?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_web_index_php_dashboard_index/button_MyTimesheet'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 3-Click on button MyTimesheet - Navigate to page webindexphptimeviewMyTimesheet.png')

"Step 4: Click on button Edit -> Navigate to page '/web/index.php/time/editTimesheet/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/web/index.php/time/viewMyTimesheet?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_web_index_php_time_viewMyTimesheet/button_Edit'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 4-Click on button Edit - Navigate to page webindexphptimeeditTimesheet.png')

"Step 5: Click on input TimesheetEntry"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/web/index.php/time/editTimesheet/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_web_index_php_time_editTimesheet/input_TimesheetEntry'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 5-Click on input TimesheetEntry.png')

"Step 6: Enter input value in input TimesheetEntry2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/web/index.php/time/editTimesheet/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_web_index_php_time_editTimesheet/input_TimesheetEntry2'), input_TimesheetEntry2)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 6-Enter input value in input TimesheetEntry2.png')

"Step 7: Click on table ProjectActivity"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/web/index.php/time/editTimesheet/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_web_index_php_time_editTimesheet/table_ProjectActivity'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 7-Click on table ProjectActivity.png')

"Step 8: Click on button Save -> Navigate to page '/web/index.php/time/viewMyTimesheet'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/web/index.php/time/editTimesheet/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_web_index_php_time_editTimesheet/button_Save'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 8-Click on button Save - Navigate to page webindexphptimeviewMyTimesheet.png')

"Step 9: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC3-Edit Timesheet Entry in HR Portal_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}