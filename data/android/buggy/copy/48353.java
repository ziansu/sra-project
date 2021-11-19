public org.apache.http.client.HttpClient getHttpClient() {
    if ((httpClient) == null)
        httpClient = groovejames.service.HttpClientService.createHttpClient(proxySettings);
    
    return httpClient;
}