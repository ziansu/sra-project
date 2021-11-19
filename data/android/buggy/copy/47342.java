public java.lang.String getMessageAsString() throws java.io.UnsupportedEncodingException {
    return new java.lang.String(payload.array(), "UTF8").trim();
}