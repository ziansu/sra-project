public yuown.yuventory.model.UserModel createUser(yuown.yuventory.model.UserModel fromClient) {
    fromClient.getAuthorities().removeAll(fromClient.getAuthorities());
    org.springframework.security.core.userdetails.UserDetails user = transformer().transformToSecurityUser(fromClient);
    jdbcUserDetailsManager.createUser(user);
    return fromClient;
}