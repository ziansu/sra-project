@org.testng.annotations.Test
public void method1(java.lang.reflect.Method method) {
    com.relevantcodes.extentreports.common.ExtentTestManager.createTest(method.getName()).pass("pass");
    org.testng.Assert.assertEquals(com.relevantcodes.extentreports.common.ExtentTestManager.getTest().getRunStatus(), Status.PASS);
}