private void registerIfAnnotationConfigApplicationContext(org.springframework.context.ConfigurableApplicationContext context) {
    if (context instanceof org.springframework.context.annotation.AnnotationConfigApplicationContext) {
        ((org.springframework.context.annotation.AnnotationConfigApplicationContext) (context)).register(org.wso2.msf4j.spring.MSF4JSpringConfiguration.class, configurationClass);
    }
}