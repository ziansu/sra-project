@java.lang.Override
public java.io.InputStream getInputStream() throws java.io.IOException {
    return new java.io.ByteArrayInputStream(this.content.getBytes(this.charsetName));
}