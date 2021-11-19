public void addArgumentsResolvers(java.util.List<org.springframework.web.method.support.HandlerMethodArgumentResolver> argumentResolvers) {
    org.springframework.data.web.PageableHandlerMethodArgumentResolver phmar = new org.springframework.data.web.PageableHandlerMethodArgumentResolver();
    phmar.setFallbackPageable(new org.springframework.data.domain.PageRequest(0, 5));
    argumentResolvers.add(phmar);
    super.addArgumentResolvers(argumentResolvers);
}