@java.lang.Override
public org.springframework.security.core.userdetails.UserDetails loadUserByUsername(final java.lang.String username) throws org.springframework.security.core.userdetails.UsernameNotFoundException {
    try {
        return userService.findByName(username);
    } catch (org.springframework.security.core.userdetails.UsernameNotFoundException e) {
        throw e;
    }
}