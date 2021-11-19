public void setData(byte[] data) {
    responseData = data;
    setData(new java.io.ByteArrayInputStream(data));
}