@org.springframework.context.annotation.Bean
public org.springframework.web.client.RestTemplate restTemplate() {
    org.springframework.web.client.RestTemplate restTemplate = new org.springframework.web.client.RestTemplate();
    java.util.List<org.springframework.http.converter.HttpMessageConverter<?>> messageConverters = new java.util.ArrayList<>();
    messageConverters.add(marshallingHttpMessageConverter());
    restTemplate.setMessageConverters(messageConverters);
    return restTemplate;
}