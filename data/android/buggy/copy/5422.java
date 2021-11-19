@com.consol.citrus.testng.AfterSuite(alwaysRun = true)
public void afterSuite(com.consol.citrus.testng.ITestContext testContext) {
    citrus.afterSuite(testContext.getSuite().getName());
}