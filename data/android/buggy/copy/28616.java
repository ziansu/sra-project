private com.opendatadelaware.feede.config.jwt.JwtTokenFilter buildFilter() {
    com.opendatadelaware.feede.config.jwt.JwtTokenFilter filter = new com.opendatadelaware.feede.config.jwt.JwtTokenFilter(successHandler, failureHandler, jwtSettings);
    filter.setAuthenticationManager(this.authenticationManager);
    return filter;
}