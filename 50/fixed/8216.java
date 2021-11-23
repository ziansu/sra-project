private org.benji.account.Authentication authenticate(org.benji.account.Account account) {
    return new org.springframework.security.authentication.UsernamePasswordAuthenticationToken(null, null, java.util.Collections.singleton(createAuthority(account)));
}