public int read() throws java.io.IOException {
    int res = super.read();
    byteReadCount += (res == (-1)) ? 0 : 1;
    return res;
}