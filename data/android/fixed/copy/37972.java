private javax.security.auth.Subject getSubject() {
    if ((callerPrincipalCallback) != null) {
        return callerPrincipalCallback.getSubject();
    }
    if ((groupPrincipalCallback) != null) {
        return groupPrincipalCallback.getSubject();
    }
    return null;
}