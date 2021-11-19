@java.lang.Override
public void write(char[] cbuf, int off, int len) throws java.io.IOException {
    super.write(new java.lang.String(cbuf), off, len);
}