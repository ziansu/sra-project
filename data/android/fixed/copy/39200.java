@org.springframework.context.annotation.Bean
public org.springframework.amqp.rabbit.core.RabbitAdmin rabbitAdmin() {
    log.trace("connectionFactory.host={}", connectionFactory.getHost());
    lombok.val admin = new org.springframework.amqp.rabbit.core.RabbitAdmin(connectionFactory);
    admin.declareExchange(seisoNotificationsExchange());
    return admin;
}