@java.lang.Override
public java.io.OutputStream write(java.net.URI uri) throws java.io.IOException {
    return new java.io.FileOutputStream(new java.io.File(uri));
}