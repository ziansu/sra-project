@org.junit.Test
public void testInvalidConfig() throws java.lang.Exception {
    CloudWatchMonitor c = new CloudWatchMonitor(null, null);
    assertLogsContainErrorMessage(c);
}