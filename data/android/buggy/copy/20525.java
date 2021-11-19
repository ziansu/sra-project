@org.junit.Test
public void createHeadersTest() {
    org.springframework.http.HttpHeaders headers = smsTemplate.createHeaders();
    org.junit.Assert.assertEquals(apiKey, headers.get("client_id"));
}