public int available() throws java.io.IOException {
    return (bitsAvailable()) * (java.lang.Byte.SIZE);
}