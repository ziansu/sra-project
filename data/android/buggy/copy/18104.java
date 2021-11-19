@org.springframework.context.annotation.Bean
org.springframework.amqp.core.TopicExchange exchange() {
    org.springframework.amqp.core.TopicExchange topex = new org.springframework.amqp.core.TopicExchange(exchange);
    return topex;
}