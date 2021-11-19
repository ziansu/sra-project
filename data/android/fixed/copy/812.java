@java.lang.Override
public void configure(org.springframework.security.config.annotation.web.builders.WebSecurity web) throws java.lang.Exception {
    web.ignoring().antMatchers("/static/**", "/css/**", "/js/**", "/images/**");
}