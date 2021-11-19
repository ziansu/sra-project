private char read() throws java.io.IOException {
    final char c = peek();
    at += 1;
    return c;
}