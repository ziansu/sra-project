public boolean logout() throws javax.security.auth.login.LoginException {
    subject.getPrincipals().remove(userPrincipal);
    succeeded = false;
    succeeded = commitSucceeded;
    userPrincipal = null;
    return true;
}