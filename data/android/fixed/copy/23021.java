@org.junit.Before
public void init() {
    org.mockito.MockitoAnnotations.initMocks(this);
    httpClient = new org.apache.commons.httpclient.HttpClient();
    restOperations = new org.springframework.web.client.RestTemplate();
}