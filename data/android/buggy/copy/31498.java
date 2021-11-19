public void setData(java.nio.ByteBuffer data) {
    this.data = new java.util.ArrayList<java.nio.ByteBuffer>(1);
    this.data.add(data);
    setUpdateNeeded();
}