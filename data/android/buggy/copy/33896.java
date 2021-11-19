static java.util.List<org.eclipse.jetty.plus.annotation.ContainerInitializer> jspInitializers() {
    org.eclipse.jetty.apache.jsp.JettyJasperInitializer sci = new org.eclipse.jetty.apache.jsp.JettyJasperInitializer();
    org.eclipse.jetty.plus.annotation.ContainerInitializer initializer = new org.eclipse.jetty.plus.annotation.ContainerInitializer(sci, null);
    return java.util.Collections.singletonList(initializer);
}