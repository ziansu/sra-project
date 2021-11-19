@java.lang.Override
public void onPartitionsRevoked(java.util.Collection<org.apache.kafka.common.TopicPartition> partitions) {
    this.logger.info(("partitions revoked:" + partitions));
}