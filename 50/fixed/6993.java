public boolean isClosed() {
    return (messageInputStream.isClosed()) && ((currentByteBuffer) == null);
}