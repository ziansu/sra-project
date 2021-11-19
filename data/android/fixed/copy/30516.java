private static org.apache.http.client.HttpClient createHttpClient() {
    return org.apache.http.impl.client.HttpClientBuilder.create().useSystemProperties().setDefaultCredentialsProvider(new org.opentravel.schemacompiler.repository.impl.NTLMSystemCredentialsProvider()).build();
}