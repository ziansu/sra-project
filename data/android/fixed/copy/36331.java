private java.lang.String encodingString(final java.lang.String originValue) {
    try {
        return originValue == null ? null : new java.lang.String(originValue.getBytes(org.codelogger.web.servlet.DispatcherServlet.DEFAULT_CHARSET), requestEncoding);
    } catch (java.io.UnsupportedEncodingException e) {
        return originValue;
    }
}