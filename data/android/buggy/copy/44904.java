@java.lang.Override
public java.util.Collection<? extends org.springframework.security.core.GrantedAuthority> getAuthorities() {
    java.lang.String userRoles = org.springframework.util.StringUtils.collectionToCommaDelimitedString(roles);
    return org.springframework.security.core.authority.AuthorityUtils.commaSeparatedStringToAuthorityList(userRoles);
}