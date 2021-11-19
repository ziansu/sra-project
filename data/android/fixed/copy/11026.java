public <NV> org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<K, NV> setValue(org.apache.storm.kafka.spout.SerializableDeserializer<NV> valueDeserializer) {
    return new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder(this, keyDes, valueDeserializer);
}