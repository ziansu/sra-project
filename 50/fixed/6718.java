public boolean logout() throws javax.security.auth.login.LoginException {
    subject.getPrincipals().remove(userPrincipal);
    succeeded = commitSucceeded;
    userPrincipal = null;
    return true;
}