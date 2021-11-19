private byte[] getAssembledBytes() throws java.lang.Exception {
    compile();
    link();
    return java.nio.file.Files.readAllBytes(binaryFile);
}