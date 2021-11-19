@org.testng.annotations.Test
public void method7(java.lang.reflect.Method method) {
    com.relevantcodes.extentreports.common.ExtentTestManager.createTest(method.getName());
    org.junit.Assert.assertEquals(com.relevantcodes.extentreports.common.ExtentTestManager.getTest().getRunStatus(), Status.UNKNOWN);
}