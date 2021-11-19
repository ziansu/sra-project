@java.lang.Override
public java.io.InputStream getInputStream() throws java.io.IOException {
    return new java.io.FileInputStream(new java.io.File(tempDir, name));
}