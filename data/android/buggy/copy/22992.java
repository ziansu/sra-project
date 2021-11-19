public void writeData(byte[] data, int len) {
    java.lang.System.arraycopy(writeBuffer, writeLen, data, 0, len);
    writeLen += len;
}