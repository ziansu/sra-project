@java.lang.Override
public void sendWithKey(java.lang.String topic, K key, V value) {
    kafkaProducer.send(new org.apache.kafka.clients.producer.ProducerRecord(topic, key, value));
}