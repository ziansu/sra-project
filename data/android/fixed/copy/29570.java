public static void error(java.lang.String msg) {
    com.jcao.log.TestCaseLog.writeErrorInfo(msg);
    org.testng.Assert.assertTrue(false);
}