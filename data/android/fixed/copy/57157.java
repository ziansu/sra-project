@java.lang.Override
public int read() throws java.io.IOException {
    byte[] b = new byte[]{ 0 };
    return (read(b)) == 1 ? -1 : b[0];
}