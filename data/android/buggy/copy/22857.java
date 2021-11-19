@org.junit.Test
public void responseStatusCodeSuccessful_noError() throws java.lang.Exception {
    java.lang.String response = getEncodedIdpResponse(FILE_UNSIGNED_LOGOUT_RESPONSE);
    final boolean successful = samlLogoutResponseValidator.responseStatusCodeSuccessful(response);
    org.junit.Assert.assertTrue(successful);
}