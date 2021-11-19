@java.lang.Override
public void write(char[] cbuf, int off, int len) throws java.io.IOException {
    java.lang.String newStr = java.lang.String.valueOf(cbuf);
    out.write(newStr, off, len);
}