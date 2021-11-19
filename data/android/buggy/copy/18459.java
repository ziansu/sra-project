@org.junit.Before
public void setUp() throws java.lang.Exception {
    server = new org.springframework.security.ldap.server.ApacheDSContainer(org.springframework.security.ldap.server.ApacheDSEmbeddedLdifTests.LDAP_ROOT, "classpath:test-server-custom-attribute-types.ldif");
    server.setPort(org.springframework.security.ldap.server.ApacheDSEmbeddedLdifTests.LDAP_PORT);
    server.afterPropertiesSet();
    ldapTemplate = new org.springframework.security.ldap.SpringSecurityLdapTemplate(createLdapContextSource());
}