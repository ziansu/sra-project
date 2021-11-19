@org.junit.Test
public void testTimeoutPasses() throws java.lang.Exception {
    java.lang.String message = callPaydock("charges", HttpMethod.GET, "", false, 30000);
    org.junit.Assert.assertTrue((!(message.equals("Request Timeout"))));
}