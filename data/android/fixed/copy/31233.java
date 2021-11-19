@org.testng.annotations.Test
public void method5(java.lang.reflect.Method method) {
    com.relevantcodes.extentreports.common.ExtentTestManager.createTest(method.getName()).info("info");
    org.testng.Assert.assertEquals(com.relevantcodes.extentreports.common.ExtentTestManager.getTest().getRunStatus(), Status.PASS);
}