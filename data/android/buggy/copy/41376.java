@java.lang.Override
public void addInterceptors(org.springframework.web.servlet.config.annotation.InterceptorRegistry registry) {
    registry.addInterceptor(authInterceptor()).addPathPatterns("/api/**");
    registry.addInterceptor(logInterceptor()).addPathPatterns("/**");
}