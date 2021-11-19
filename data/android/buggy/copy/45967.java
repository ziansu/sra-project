@java.lang.Override
public void onFinish(org.testng.ITestContext testContext) {
    synchronized(com.epam.reportportal.testng.ReportPortalTestNGListenerGropByClass.results) {
        for (java.lang.String className : com.epam.reportportal.testng.ReportPortalTestNGListenerGropByClass.results.keySet()) {
            com.epam.reportportal.testng.TestResultsPerClass result = com.epam.reportportal.testng.ReportPortalTestNGListenerGropByClass.results.get(className);
            reportFinishTestClass(new java.util.Date(), result);
        }
    }
}