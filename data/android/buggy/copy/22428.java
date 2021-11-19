public int read() {
    int res = super.read();
    byteReadCount += (res == (-1)) ? 0 : 1;
    return res;
}