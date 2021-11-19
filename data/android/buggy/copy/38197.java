@java.lang.Override
protected void configure(org.springframework.security.config.annotation.web.builders.HttpSecurity http) throws java.lang.Exception {
    configureRoutes(http);
    http.headers().addHeaderWriter(new org.springframework.security.web.header.writers.StaticHeadersWriter("Referrer-Policy", "same-origin"));
}