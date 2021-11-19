private java.nio.ByteBuffer acquireBuffer() {
    org.eclipse.jetty.client.HttpClient client = getHttpDestination().getHttpClient();
    org.eclipse.jetty.io.ByteBufferPool bufferPool = client.getByteBufferPool();
    return bufferPool.acquire(client.getResponseBufferSize(), true);
}