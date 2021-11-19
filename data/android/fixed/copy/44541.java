@org.springframework.context.annotation.Bean
public org.springframework.amqp.core.AmqpTemplate amqpTemplate() {
    return new org.springframework.amqp.rabbit.core.RabbitTemplate(connectionFactory);
}