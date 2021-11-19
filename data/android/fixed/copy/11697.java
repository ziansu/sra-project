private boolean isAuthenticationSupported(org.apache.catalina.connector.Request request) {
    java.lang.String param = request.getContext().findParameter("basicAuth");
    return (param != null) && (java.lang.Boolean.parseBoolean(param));
}