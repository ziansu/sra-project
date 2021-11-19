@org.springframework.beans.factory.annotation.Autowired
public void configureGlobal(org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder auth) throws java.lang.Exception {
    auth.userDetailsService(userDetailsService).passwordEncoder(passwordEncoder());
}