@java.lang.Override
public void onPartitionsAssigned(java.util.Collection<org.apache.kafka.common.TopicPartition> partitions) {
    this.assignedPartitions = partitions;
    this.logger.info(("partitions assigned:" + partitions));
}