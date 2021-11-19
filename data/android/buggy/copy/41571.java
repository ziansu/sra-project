@org.springframework.context.annotation.Bean
public org.springframework.kafka.core.KafkaTemplate kafkaTemplate() {
    return new org.springframework.kafka.core.KafkaTemplate(producerFactory());
}