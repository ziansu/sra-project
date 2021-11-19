@org.junit.Test
public void testNoHeader() throws java.lang.Exception {
    final com.puppycrawl.tools.checkstyle.DefaultConfiguration checkConfig = createCheckConfig(com.puppycrawl.tools.checkstyle.checks.header.HeaderCheck.class);
    createChecker(checkConfig);
}