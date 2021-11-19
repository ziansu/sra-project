@java.lang.Override
public void init(javax.servlet.ServletConfig config) throws javax.servlet.ServletException {
    org.wso2.carbon.identity.application.authenticator.iwa.AuthenticationHandler.setSystemProperties("krb5.conf");
    try {
        org.wso2.carbon.identity.application.authenticator.iwa.AuthenticationHandler.initialize();
    } catch (org.ietf.jgss.GSSException | javax.security.auth.login.LoginException | java.security.PrivilegedActionException e) {
        org.wso2.carbon.identity.application.authenticator.iwa.servlet.IWAServelet.log.error("Error when creating gss credentials .", e);
    }
}