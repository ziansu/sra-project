private void acquireBuffer() {
    org.eclipse.jetty.client.HttpClient client = getHttpDestination().getHttpClient();
    org.eclipse.jetty.io.ByteBufferPool bufferPool = client.getByteBufferPool();
    buffer = bufferPool.acquire(client.getResponseBufferSize(), true);
}