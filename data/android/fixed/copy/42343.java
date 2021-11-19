public void setData(java.nio.ByteBuffer data) {
    super.setData(data);
    super.setLength(((data.limit()) - (data.position())));
}