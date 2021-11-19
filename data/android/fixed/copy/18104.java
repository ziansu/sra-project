@org.springframework.context.annotation.Bean
org.springframework.amqp.core.TopicExchange exchange() {
    return new org.springframework.amqp.core.TopicExchange(exchange);
}