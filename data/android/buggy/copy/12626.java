@org.junit.Test
public void testPathRegexWithOnlySlash() {
    java.lang.String jsonPathRegex = "/";
    try {
        org.batfish.client.Client.validateJsonPathRegex(jsonPathRegex);
    } catch (java.lang.Exception e) {
        throw new org.batfish.common.BatfishException("Unexpected exception");
    }
}