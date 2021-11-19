@java.lang.Override
public void shutDown() {
    kafkaProducer.flush();
    kafkaProducer.close();
    org.darkphoenixs.kafka.core.KafkaMessageNewSender.instance.set(null);
}