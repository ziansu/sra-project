@java.lang.Override
protected org.acegisecurity.userdetails.UserDetails authenticate(java.lang.String username, java.lang.String password) throws org.acegisecurity.AuthenticationException {
    javax.naming.ldap.LdapContext ctx = connectToLdap(username, password);
    return createUserDetails(ctx, username, true);
}