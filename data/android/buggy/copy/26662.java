@java.lang.Override
public int read(byte[] b) throws java.io.IOException {
    return read(b, offset, b.length);
}