@org.testng.annotations.Test
public void method5(java.lang.reflect.Method method) {
    com.relevantcodes.extentreports.common.ExtentTestManager.createTest(method.getName()).info("info");
    org.junit.Assert.assertEquals(com.relevantcodes.extentreports.common.ExtentTestManager.getTest().getRunStatus(), Status.PASS);
}