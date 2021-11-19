@java.lang.Override
public void customize(org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer container) {
    if (container instanceof org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory) {
        org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory tomcatFactory = ((org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory) (container));
        tomcatFactory.addContextCustomizers(customizer);
    }
}