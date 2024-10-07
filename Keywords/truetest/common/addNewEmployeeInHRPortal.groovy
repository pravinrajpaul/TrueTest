package truetest.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

public class addNewEmployeeInHRPortal {
    
    private static def execute_functional_method(Map data) {
        
        "Step 1: Click on link PIM -> Navigate to page '/web/index.php/pim/viewEmployeeList'"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_web_index_php_dashboard_index/link_PIM'))
        
        "Step 2: Click on link AddEmployee -> Navigate to page '/web/index.php/pim/addEmployee'"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_web_index_php_pim_viewEmployeeList/link_AddEmployee'))
        
        "Step 3: Click on input FirstName"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_web_index_php_pim_addEmployee/input_FirstName'))
        
        "Step 4: Enter input value in input FirstName"
        
        WebUI.setText(findTestObject('AI-Generated/Page_web_index_php_pim_addEmployee/input_FirstName'), data['input_FirstName'])
        
        "Step 5: Click on input MiddleName"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_web_index_php_pim_addEmployee/input_MiddleName'))
        
        "Step 6: Enter input value in input MiddleName"
        
        WebUI.setText(findTestObject('AI-Generated/Page_web_index_php_pim_addEmployee/input_MiddleName'), data['input_MiddleName'])
        
        "Step 7: Click on input LastName"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_web_index_php_pim_addEmployee/input_LastName'))
        
        "Step 8: Enter input value in input LastName"
        
        WebUI.setText(findTestObject('AI-Generated/Page_web_index_php_pim_addEmployee/input_LastName'), data['input_LastName'])
        
        "Step 9: Click on button Save"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_web_index_php_pim_addEmployee/button_Save'))
    }
    
    private static def execute_with_data_source(String datasource, int rowIndex) {
        TestData testData = findTestData(datasource)
        Map data = [:]
        data['input_FirstName'] = testData.getValue('input_FirstName', rowIndex)
        data['input_LastName'] = testData.getValue('input_LastName', rowIndex)
        data['input_MiddleName'] = testData.getValue('input_MiddleName', rowIndex)
        execute_functional_method(data)
    }
    
    private static def execute_without_data_source() {
        Map data = [:]
        data['input_FirstName'] = 'default_data'
        data['input_LastName'] = 'default_data'
        data['input_MiddleName'] = 'default_data'
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

