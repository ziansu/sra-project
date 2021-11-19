protected void flushNow() throws java.io.IOException {
    if ((buffer.length) > 0) {
        com.ibm.streamsx.hdfs.AsyncBufferWriter.FlushRunnable runnable = new com.ibm.streamsx.hdfs.AsyncBufferWriter.FlushRunnable(buffer, false, position, false);
        runnable.run();
    }
}