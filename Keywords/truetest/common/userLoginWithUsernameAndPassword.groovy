package truetest.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

public class userLoginWithUsernameAndPassword {
    
    private static def execute_functional_method(Map data) {
        
        "Step 1: Click on input Username"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_auth_login/input_Username'))
        
        "Step 2: Enter input value in input Username"
        
        WebUI.setText(findTestObject('AI-Generated/Page_auth_login/input_Username'), data['input_Username'])
        
        "Step 3: Click on input Password"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_auth_login/input_Password'))
        
        "Step 4: Enter input value in input Password"
        
        WebUI.setText(findTestObject('AI-Generated/Page_auth_login/input_Password'), data['input_Password'])
        
        "Step 5: Click on button Login"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_auth_login/button_Login'))
        
        "Step 6: Click on input Username"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_auth_login/input_Username'))
        
        "Step 7: Click on input Password"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_auth_login/input_Password'))
        
        "Step 8: Enter input value in input Username"
        
        WebUI.setText(findTestObject('AI-Generated/Page_auth_login/input_Username'), data['input_Username'])
        
        "Step 9: Enter input value in input Password"
        
        WebUI.setText(findTestObject('AI-Generated/Page_auth_login/input_Password'), data['input_Password'])
        
        "Step 10: Click on button Login"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_auth_login/button_Login'))
    }
    
    private static def execute_with_data_source(String datasource, int rowIndex) {
        TestData testData = findTestData(datasource)
        Map data = [:]
        data['input_Password'] = testData.getValue('input_Password', rowIndex)
        data['input_Password_1'] = testData.getValue('input_Password_1', rowIndex)
        data['input_Username'] = testData.getValue('input_Username', rowIndex)
        data['input_Username_1'] = testData.getValue('input_Username_1', rowIndex)
        execute_functional_method(data)
    }
    
    private static def execute_without_data_source() {
        Map data = [:]
        data['input_Password'] = 'default_data'
        data['input_Password_1'] = 'default_data'
        data['input_Username'] = 'default_data'
        data['input_Username_1'] = 'default_data'
        execute_functional_method(data)
    }
    
    public static def execute(String datasource = null, int rowIndex = 1) {
        if (datasource != null) {
            execute_with_data_source(datasource, rowIndex)
        } else {
            execute_without_data_source()
        }
    }
}

