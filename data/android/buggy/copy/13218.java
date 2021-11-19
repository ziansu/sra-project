public void spill(org.apache.flink.runtime.io.network.partition.consumer.BufferOrEvent boe) throws java.io.IOException {
    org.apache.flink.runtime.io.network.buffer.Buffer buffer = boe.getBuffer();
    spillingChannel = createSpillingChannel();
    spillingChannel.write(buffer.getNioBuffer());
    buffer.recycle();
}