@java.lang.Override
public java.io.InputStream getContent() {
    return new java.io.ByteArrayInputStream(this.b, this.off, this.len);
}