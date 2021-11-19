@java.lang.Override
public java.io.InputStream getContent() {
    return new java.io.ByteArrayInputStream(this.b, this.offset, this.len);
}