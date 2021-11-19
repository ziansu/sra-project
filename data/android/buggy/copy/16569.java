private void saveByteArray() {
    try {
        java.nio.file.Files.write(path, byteArray, java.nio.file.StandardOpenOption.WRITE);
    } catch (java.io.IOException e) {
    }
}