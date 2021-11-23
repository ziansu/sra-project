private void doBackendAuthorization(java.lang.String code, com.predic8.membrane.core.interceptor.authentication.session.SessionManager.Session s) {
    authCodesToSession.put(code, s);
}