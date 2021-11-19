private byte[] getBytes(final java.lang.String s, final java.lang.String charset) {
    try {
        return s.getBytes(charset);
    } catch (java.io.UnsupportedEncodingException e) {
        return s.getBytes();
    }
}