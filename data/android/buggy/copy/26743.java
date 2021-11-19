@org.springframework.context.annotation.Bean
public com.netflix.loadbalancer.IRule ribbonRule(com.netflix.client.config.IClientConfig config) {
    return new com.netflix.loadbalancer.RoundRobinRule();
}