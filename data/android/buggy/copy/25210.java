@java.lang.Override
public void write(byte[] bytes, int off, int len) throws java.io.IOException {
    byte[] newBytes = transform.transform(bytes, off, len);
    target.write(newBytes, off, len);
}