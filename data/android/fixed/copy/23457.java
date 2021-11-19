@java.lang.Override
public void write(char[] cbuf, int off, int len) throws java.io.IOException {
    out.write(new java.lang.String(cbuf).toUpperCase(), off, len);
}