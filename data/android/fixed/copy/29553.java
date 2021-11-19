private org.apache.http.impl.client.CloseableHttpClient createHttpClient() {
    return org.apache.http.impl.client.HttpClientBuilder.create().setRedirectStrategy(new pl.kubiczak.felix.shark.samples.tests.functional.NoFollowStrategy()).build();
}