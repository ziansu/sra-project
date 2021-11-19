private static org.apache.http.client.HttpClient createHttpClient() {
    org.apache.http.impl.client.CloseableHttpClient client = org.apache.http.impl.client.HttpClientBuilder.create().useSystemProperties().setDefaultCredentialsProvider(new org.opentravel.schemacompiler.repository.impl.NTLMSystemCredentialsProvider()).build();
    return client;
}