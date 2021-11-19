public void spill(org.apache.flink.runtime.io.network.buffer.Buffer buffer) throws java.io.IOException {
    spillingChannel.write(buffer.getNioBuffer());
    buffer.recycle();
}