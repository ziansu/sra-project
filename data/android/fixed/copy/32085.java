@org.springframework.context.annotation.Bean
public org.springframework.security.authentication.dao.DaoAuthenticationProvider authenticationProvider() {
    org.springframework.security.authentication.dao.DaoAuthenticationProvider authenticationProvider = new org.springframework.security.authentication.dao.DaoAuthenticationProvider();
    authenticationProvider.setPasswordEncoder(passwordEncoder());
    authenticationProvider.setUserDetailsService(userDetailsService);
    return authenticationProvider;
}