public com.mongodb.gridfs.GridFSInputFile createFile(final java.io.File file) throws java.io.IOException {
    java.io.FileInputStream fileInputStream = new java.io.FileInputStream(file);
    try {
        return createFile(fileInputStream, file.getName(), true);
    } finally {
        fileInputStream.close();
    }
}