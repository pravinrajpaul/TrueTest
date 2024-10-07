import internal.GlobalVariable
import truetest.custom.TrueTestScripts
import com.kms.katalon.core.configuration.RunConfiguration
import truetest.common.userLoginWithUsernameAndPassword
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to auth/login"

TrueTestScripts.navigate("auth/login")

"Step 2: Login to the application with username and password"

userLoginWithUsernameAndPassword.execute(data_path_0, Integer.valueOf(index_0))

"Step 3: Click on button ApplyLeave -> Navigate to page 'leave/applyLeave'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard/index?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dashboard_index/button_ApplyLeave'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 3-Click on button ApplyLeave - Navigate to page leaveapplyLeave.png')

"Step 4: Click on icon LeaveApplyFirst"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/leave/applyLeave?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_leave_applyLeave/icon_LeaveApplyFirst'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 4-Click on icon LeaveApplyFirst.png')

"Step 5: Click on icon LeaveApplyThird"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/leave/applyLeave?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_leave_applyLeave/icon_LeaveApplyThird'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 5-Click on icon LeaveApplyThird.png')

"Step 6: Click on button LeaveApplySecond"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/leave/applyLeave?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_leave_applyLeave/button_LeaveApplySecond'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 6-Click on button LeaveApplySecond.png')

"Step 7: Click on button LeaveApplySecond"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/leave/applyLeave?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_leave_applyLeave/button_LeaveApplySecond'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 7-Click on button LeaveApplySecond.png')

"Step 8: Click on div LeaveDaysFirst"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/leave/applyLeave?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_leave_applyLeave/div_LeaveDaysFirst'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 8-Click on div LeaveDaysFirst.png')

"Step 9: Click on icon LeaveApplyFourth"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/leave/applyLeave?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_leave_applyLeave/icon_LeaveApplyFourth'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 9-Click on icon LeaveApplyFourth.png')

"Step 10: Click on div LeaveDaysSecond"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/leave/applyLeave?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_leave_applyLeave/div_LeaveDaysSecond'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 10-Click on div LeaveDaysSecond.png')

"Step 11: Click on icon LeaveApplyFifth"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/leave/applyLeave?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_leave_applyLeave/icon_LeaveApplyFifth'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 11-Click on icon LeaveApplyFifth.png')

"Step 12: Click on div SelectOptionFirst"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/leave/applyLeave?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_leave_applyLeave/div_SelectOptionFirst'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 12-Click on div SelectOptionFirst.png')

"Step 13: Click on div LeaveDuration"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/leave/applyLeave?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_leave_applyLeave/div_LeaveDuration'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 13-Click on div LeaveDuration.png')

"Step 14: Click on icon LeaveSelect"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/leave/applyLeave?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_leave_applyLeave/icon_LeaveSelect'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 14-Click on icon LeaveSelect.png')

"Step 15: Click on textarea LeaveDescription"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/leave/applyLeave?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_leave_applyLeave/textarea_LeaveDescription'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 15-Click on textarea LeaveDescription.png')

"Step 16: Enter input value in textarea LeaveDescription"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/leave/applyLeave?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_leave_applyLeave/textarea_LeaveDescription'), textarea_LeaveDescription)

WebUI.takeScreenshot(reportLocation + '/TC2/Step 16-Enter input value in textarea LeaveDescription.png')

"Step 17: Click on button Apply"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/leave/applyLeave?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_leave_applyLeave/button_Apply'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 17-Click on button Apply.png')

"Step 18: Click on link MyLeave -> Navigate to page 'leave/viewMyLeaveList'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/leave/applyLeave?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_leave_applyLeave/link_MyLeave'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 18-Click on link MyLeave - Navigate to page leaveviewMyLeaveList.png')

"Step 19: Click on link Dashboard -> Navigate to page 'dashboard/index'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/leave/viewMyLeaveList?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_leave_viewMyLeaveList/link_Dashboard'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 19-Click on link Dashboard - Navigate to page dashboardindex.png')

"Step 20: Click on button MyTimesheet -> Navigate to page 'time/viewMyTimesheet'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard/index?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dashboard_index/button_MyTimesheet'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 20-Click on button MyTimesheet - Navigate to page timeviewMyTimesheet.png')

"Step 21: Click on button Edit -> Navigate to page 'time/editTimesheet/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/time/viewMyTimesheet?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_time_viewMyTimesheet/button_Edit'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 21-Click on button Edit - Navigate to page timeeditTimesheet.png')

"Step 22: Click on input HintType"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/time/editTimesheet/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_time_editTimesheet/input_HintType'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 22-Click on input HintType.png')

"Step 23: Enter input value in input HintType"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/time/editTimesheet/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_time_editTimesheet/input_HintType'), input_HintType)

WebUI.takeScreenshot(reportLocation + '/TC2/Step 23-Enter input value in input HintType.png')

"Step 24: Click on div AdminMenu"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/time/editTimesheet/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_time_editTimesheet/div_AdminMenu'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 24-Click on div AdminMenu.png')

"Step 25: Click on icon SelectOption"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/time/editTimesheet/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_time_editTimesheet/icon_SelectOption'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 25-Click on icon SelectOption.png')

"Step 26: Click on input HintType"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/time/editTimesheet/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_time_editTimesheet/input_HintType'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 26-Click on input HintType.png')

"Step 27: Click on input TextboxFirst"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/time/editTimesheet/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_time_editTimesheet/input_TextboxFirst'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 27-Click on input TextboxFirst.png')

"Step 28: Enter input value in input TextboxSecond"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/time/editTimesheet/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_time_editTimesheet/input_TextboxSecond'), input_TextboxSecond)

WebUI.takeScreenshot(reportLocation + '/TC2/Step 28-Enter input value in input TextboxSecond.png')

"Step 29: Click on input TextboxFirst2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/time/editTimesheet/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_time_editTimesheet/input_TextboxFirst2'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 29-Click on input TextboxFirst2.png')

"Step 30: Enter input value in input TextboxThird"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/time/editTimesheet/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_time_editTimesheet/input_TextboxThird'), input_TextboxThird)

WebUI.takeScreenshot(reportLocation + '/TC2/Step 30-Enter input value in input TextboxThird.png')

"Step 31: Click on input TextboxFirst3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/time/editTimesheet/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_time_editTimesheet/input_TextboxFirst3'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 31-Click on input TextboxFirst3.png')

"Step 32: Enter input value in input TextboxFourth"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/time/editTimesheet/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_time_editTimesheet/input_TextboxFourth'), input_TextboxFourth)

WebUI.takeScreenshot(reportLocation + '/TC2/Step 32-Enter input value in input TextboxFourth.png')

"Step 33: Click on input TextboxFirst4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/time/editTimesheet/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_time_editTimesheet/input_TextboxFirst4'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 33-Click on input TextboxFirst4.png')

"Step 34: Enter input value in input TextboxFifth"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/time/editTimesheet/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_time_editTimesheet/input_TextboxFifth'), input_TextboxFifth)

WebUI.takeScreenshot(reportLocation + '/TC2/Step 34-Enter input value in input TextboxFifth.png')

"Step 35: Click on input TextboxFirst5"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/time/editTimesheet/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_time_editTimesheet/input_TextboxFirst5'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 35-Click on input TextboxFirst5.png')

"Step 36: Enter input value in input TextboxSixth"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/time/editTimesheet/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_time_editTimesheet/input_TextboxSixth'), input_TextboxSixth)

WebUI.takeScreenshot(reportLocation + '/TC2/Step 36-Enter input value in input TextboxSixth.png')

"Step 37: Click on button Save"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/time/editTimesheet/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_time_editTimesheet/button_Save'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 37-Click on button Save.png')

"Step 38: Click on input HintType"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/time/editTimesheet/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_time_editTimesheet/input_HintType'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 38-Click on input HintType.png')

"Step 39: Click on div AdminMenu"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/time/editTimesheet/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_time_editTimesheet/div_AdminMenu'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 39-Click on div AdminMenu.png')

"Step 40: Enter input value in input HintType"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/time/editTimesheet/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_time_editTimesheet/input_HintType'), input_HintType)

WebUI.takeScreenshot(reportLocation + '/TC2/Step 40-Enter input value in input HintType.png')

"Step 41: Click on icon SelectOptionSecond"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/time/editTimesheet/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_time_editTimesheet/icon_SelectOptionSecond'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 41-Click on icon SelectOptionSecond.png')

"Step 42: Click on button Save -> Navigate to page 'time/viewMyTimesheet'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/time/editTimesheet/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_time_editTimesheet/button_Save'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 42-Click on button Save - Navigate to page timeviewMyTimesheet.png')

"Step 43: Click on icon UserAbirMunna"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/time/viewMyTimesheet?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_time_viewMyTimesheet/icon_UserAbirMunna'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 43-Click on icon UserAbirMunna.png')

"Step 44: Click on link Logout"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/time/viewMyTimesheet?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_time_viewMyTimesheet/link_Logout'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 44-Click on link Logout.png')

"Step 45: Login to the application with username and password"

userLoginWithUsernameAndPassword.execute(data_path_1, Integer.valueOf(index_1))

"Step 46: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC2-Apply for Leave and Update Timesheet in Orange Application_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}