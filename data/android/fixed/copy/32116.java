@org.springframework.context.annotation.Bean
public org.springframework.web.client.RestTemplate restTemplate() {
    return new org.springframework.web.client.RestTemplate(clientHttpRequestFactory());
}