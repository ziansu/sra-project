@java.lang.Override
public org.springframework.http.ResponseEntity<?> execute(org.springframework.web.client.RestTemplate restTemplate, java.lang.String url, java.lang.Object request) {
    return restTemplate.exchange(url, HttpMethod.DELETE, ((org.springframework.http.HttpEntity<?>) (request)), java.lang.String.class);
}