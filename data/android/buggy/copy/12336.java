public boolean isEof() throws java.io.IOException {
    refill();
    return (nBits) != 0;
}