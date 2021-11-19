@org.springframework.context.annotation.Bean
@org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean(value = org.apache.camel.spring.boot.RoutesCollector.class)
org.apache.camel.spring.boot.RoutesCollector routesCollector(org.springframework.context.ApplicationContext applicationContext) {
    java.util.Collection<org.apache.camel.spring.boot.CamelContextConfiguration> configurations = applicationContext.getBeansOfType(org.apache.camel.spring.boot.CamelContextConfiguration.class).values();
    return new org.apache.camel.spring.boot.RoutesCollector(new java.util.ArrayList<org.apache.camel.spring.boot.CamelContextConfiguration>(configurations));
}