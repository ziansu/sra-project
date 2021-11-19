public void login() {
    java.lang.String encryptedPassword = org.apache.commons.codec.digest.DigestUtils.sha256Hex(password);
    loggedIn = serverBean.login(userName, encryptedPassword);
}