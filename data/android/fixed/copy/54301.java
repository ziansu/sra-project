@java.lang.Override
public byte readByte() throws java.io.IOException {
    byte[] b = readFully(1);
    return b[0];
}