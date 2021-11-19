@java.lang.Override
public void write(final char[] buffer, final int off, final int len) throws java.io.IOException {
    if (len > 0) {
        currentBuffer.append(buffer, off, len);
    }
}