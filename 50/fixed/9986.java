@java.lang.Override
public void write(byte[] b, int off, int len) throws java.io.IOException {
    out.write(b, off, len);
    if (len > 0)
        count += len;
    
}