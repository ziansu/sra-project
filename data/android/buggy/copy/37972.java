private javax.security.auth.Subject getSubject() {
    if ((callerPrincipalCallback) != null) {
        return callerPrincipalCallback.getSubject();
    }
    if ((groupPrincipalCallback) != null) {
        return callerPrincipalCallback.getSubject();
    }
    return null;
}