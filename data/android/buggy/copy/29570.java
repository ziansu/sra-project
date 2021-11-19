public static void writeErrorInfo(java.lang.String msg) {
    com.jcao.log.TestCaseLog.writeErrorInfo(msg);
    org.testng.Assert.assertTrue(false);
}