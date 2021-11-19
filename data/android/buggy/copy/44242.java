private void init() {
    this.inputStream.mark(bodyLengthBytes);
    bodyBytesRead = 0;
    serializeAndCacheHeaders();
}