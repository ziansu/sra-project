@org.junit.Test
public void closeShouldBeIdempotent() {
    org.apache.kafka.clients.consumer.KafkaConsumer<byte[], byte[]> consumer = newConsumer();
    consumer.close();
    consumer.close();
    consumer.close();
}