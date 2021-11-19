public <NK> org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<NK, V> setKey(org.apache.storm.kafka.spout.SerializableDeserializer<NK> keyDeserializer) {
    return new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder(this, keyDeserializer, valueDes);
}