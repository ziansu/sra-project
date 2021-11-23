public byte[] asBytes() throws java.io.IOException {
    if ((responseAsBytes) == null) {
        consume();
    }
    return responseAsBytes;
}