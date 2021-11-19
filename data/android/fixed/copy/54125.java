@java.lang.Override
public java.util.Set getAdditionalRoles(org.acegisecurity.userdetails.ldap.LdapUserDetails ldapUser) {
    return java.util.Collections.singleton(hudson.security.AUTHENTICATED_AUTHORITY);
}