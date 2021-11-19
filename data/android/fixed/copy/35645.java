public java.nio.file.Path download(java.lang.String path, java.nio.file.Path destinationDir) throws java.io.IOException {
    return download(path, "GET", MediaType.APPLICATION_OCTET_STREAM, destinationDir, false);
}