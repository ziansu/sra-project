@java.lang.Override
protected void configure(org.springframework.security.config.annotation.web.builders.HttpSecurity http) throws java.lang.Exception {
    http.anonymous().and().authorizeRequests().antMatchers("/movies/**").permitAll().and().authorizeRequests().anyRequest().authenticated();
}