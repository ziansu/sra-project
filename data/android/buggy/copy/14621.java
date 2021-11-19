public java.lang.String getContent() throws java.io.IOException {
    return new java.lang.String(javax.xml.bind.DatatypeConverter.parseBase64Binary(getEncodedContent()), getEncoding());
}