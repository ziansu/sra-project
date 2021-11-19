@org.springframework.context.annotation.Bean
@org.springframework.context.annotation.Scope(value = org.springframework.web.context.WebApplicationContext.SCOPE_REQUEST, proxyMode = org.springframework.context.annotation.ScopedProxyMode.TARGET_CLASS)
protected org.springframework.web.client.RestTemplate restTemplateWithOAuth2Token(org.trustedanalytics.cloud.auth.OAuth2TokenRetriever tokenRetriever) {
    org.springframework.http.client.HttpComponentsClientHttpRequestFactory factory = new org.springframework.http.client.HttpComponentsClientHttpRequestFactory();
    org.springframework.web.client.RestTemplate restTemplate = new org.springframework.web.client.RestTemplate(factory);
    return restTemplate;
}