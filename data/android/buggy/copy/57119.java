private java.lang.String readFile(java.lang.String path, java.nio.charset.Charset encoding) throws java.io.IOException {
    return new java.lang.String(java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(path)), encoding);
}