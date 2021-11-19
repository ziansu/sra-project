private org.apache.catalina.connector.Connector initiateHttpConnector() {
    org.apache.catalina.connector.Connector connector = new org.apache.catalina.connector.Connector("org.apache.coyote.http11.Http11NioProtocol");
    connector.setScheme("http");
    connector.setPort(8080);
    connector.setSecure(true);
    connector.setRedirectPort(8443);
    return connector;
}