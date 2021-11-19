@java.lang.SuppressWarnings(value = "unchecked")
@java.lang.Override
public org.darkphoenixs.kafka.core.KafkaMessageSender<K, V> getSender() {
    org.darkphoenixs.kafka.core.KafkaMessageNewSender<K, V> sender = org.darkphoenixs.kafka.core.KafkaMessageNewSender.getOrCreateInstance(props);
    return sender;
}