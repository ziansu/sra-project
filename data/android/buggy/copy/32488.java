protected org.elasticsearch.test.rest.client.http.HttpRequestBuilder requestWithCredentials(java.lang.String credentials) throws java.lang.Exception {
    return com.asquera.elasticsearch.plugins.http.auth.integration.HttpBasicServerPluginIntegrationTest.httpClient().path("/_status").addHeader("Authorization", ("Basic " + (org.elasticsearch.common.Base64.encodeBytes(credentials.getBytes()))));
}