public void verifyLogin(java.lang.String username, java.lang.String password) {
    if (!(password.isEmpty())) {
        api.login(username, password);
    }
}