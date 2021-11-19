@java.lang.Override
public int read(byte[] b, int off, int len) throws java.io.IOException {
    return source.read(b, off, java.lang.Math.min(available(), len));
}