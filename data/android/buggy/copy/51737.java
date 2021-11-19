@org.springframework.context.annotation.Bean
public spike.spring.axon.CommandRouter commandRouter() {
    return new org.axonframework.springcloud.commandhandling.SpringCloudCommandRouter(discoveryClient, routingStrategy(), serializer);
}