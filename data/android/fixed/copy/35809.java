public final boolean isOutgoingBatchFull() {
    return (outputPosition) >= (org.apache.drill.exec.physical.impl.join.JoinStatus.OUTPUT_BATCH_SIZE);
}