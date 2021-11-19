public void setData(java.nio.ByteBuffer data) {
    this.buffer.setData(data);
    this.buffer.setLength(((data.limit()) - (data.position())));
}