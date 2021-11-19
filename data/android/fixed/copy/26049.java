public void createUser(yuown.yuventory.model.UserModel fromClient) throws java.lang.Exception {
    fromClient.getAuthorities().removeAll(fromClient.getAuthorities());
    org.springframework.security.core.userdetails.UserDetails user = transformer().transformToSecurityUser(fromClient);
    jdbcUserDetailsManager.createUser(user);
}