@java.lang.Override
public void addInterceptors(org.springframework.web.servlet.config.annotation.InterceptorRegistry registry) {
    registry.addInterceptor(passportInterceptor);
    registry.addInterceptor(loginRequiredInterceptor).addPathPatterns("/question/*");
    super.addInterceptors(registry);
}