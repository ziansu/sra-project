@org.junit.Test
public void testTimeoutFails() throws java.lang.Exception {
    java.lang.String message = callPaydock("charges", HttpMethod.GET, "", false, 1);
    org.junit.Assert.assertTrue((message == "Request Timeout"));
}