private void configureTomcat(org.apache.catalina.startup.Tomcat tomcat, org.apache.catalina.connector.Connector connector) {
    tomcat.setBaseDir(noSuchBaseDir.toAbsolutePath().toString());
    tomcat.setConnector(connector);
    tomcat.getService().addConnector(connector);
}