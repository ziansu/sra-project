public void hasReceivedRequestWithContentType(java.lang.String expectedContentType) {
    org.junit.Assert.assertThat("request was send with different content type?", lastReceivedContentType, org.hamcrest.Matchers.is(expectedContentType));
}