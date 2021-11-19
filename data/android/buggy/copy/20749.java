@org.junit.Test
public void responseStatusCodeSuccessful_hasError() throws java.lang.Exception {
    java.lang.String response = getEncodedIdpResponse(FILE_UNSIGNED_LOGOUT_RESPONSE_ERROR_STATUS);
    final boolean successful = samlLogoutResponseValidator.responseStatusCodeSuccessful(response);
    org.junit.Assert.assertFalse(successful);
}