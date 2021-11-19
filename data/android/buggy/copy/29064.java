@java.lang.Override
public org.benji.account.UserDetails loadUserByUsername(java.lang.String username) throws org.benji.account.UsernameNotFoundException {
    org.benji.account.Account account = accountRepository.findByEmail(username);
    if (account == null) {
        throw new org.benji.account.UsernameNotFoundException("user not found");
    }
    return createUser(account);
}