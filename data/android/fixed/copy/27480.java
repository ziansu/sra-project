public void write(byte[] b, int start, int len) throws java.io.IOException {
    this.pb.putBytes(b, start, len);
}