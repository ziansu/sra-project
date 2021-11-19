public com.floragunn.searchguard.httpclient.HttpClient.HttpClientBuilder setBasicCredentials(final java.lang.String username, final java.lang.String password) {
    basicCredentials = com.floragunn.searchguard.httpclient.HttpClient.HttpClientBuilder.encodeBasicHeader(java.util.Objects.requireNonNull(username), java.util.Objects.requireNonNull(password));
    return this;
}