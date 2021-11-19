private void shiftOffsetsIfNeed(java.util.Map<org.apache.kafka.common.TopicPartition, java.lang.Long> offsets) {
    context.offset(offsets);
}