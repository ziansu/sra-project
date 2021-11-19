@java.lang.Override
public void write(byte[] bytes, int off, int len) throws java.io.IOException {
    java.nio.ByteBuffer buffer = bufferContainer.getBuffer();
    expandIfNeeded(len);
    buffer.put(bytes, off, len);
}