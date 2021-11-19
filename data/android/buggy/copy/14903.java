private java.lang.Iterable<org.apache.kafka.common.record.FileLogInputStream.FileChannelRecordBatch> batchesFrom(int start) {
    return batches(java.lang.Integer.MAX_VALUE, start);
}