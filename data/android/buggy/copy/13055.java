@java.lang.Override
public void configure(org.springframework.security.config.annotation.web.builders.WebSecurity webSecurity) throws java.lang.Exception {
    webSecurity.ignoring().antMatchers("/access", "/access/config", "/access/token", "/access/kerberos");
}