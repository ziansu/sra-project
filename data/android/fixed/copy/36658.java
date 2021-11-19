private byte read() throws java.io.IOException {
    if ((bufferPointer) == (bytesRead)) {
        fillBuffer();
    }
    return buffer[((bufferPointer)++)];
}