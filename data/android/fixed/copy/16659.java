public boolean login(java.lang.String email, java.lang.String password) {
    java.io.Serializable authenticate = securityService.authenticate(password, email);
    refreshLoginStatus();
    if (null != authenticate) {
        sessionId = authenticate;
        return true;
    }
    sessionId = null;
    return false;
}