public void testSendMessageViaElasticEmail() throws java.io.UnsupportedEncodingException {
    provider = new com.seb.email.routing.EmailServiceProvider(EmailServiceProvider.Providers.ELASTICEMAIL);
    assertEquals(HttpStatus.OK, provider.SendMessageViaElasticEmail(email));
}