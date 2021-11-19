public void applyAuthentication(java.lang.String username, java.lang.String password) {
    logger.info((((("username = [" + username) + "] password = [") + password) + "]"));
    factory.setUsername(username);
    factory.setPassword(password);
}