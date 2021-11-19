private void deleteFile(java.lang.String path) {
    final java.io.File file = new java.io.File(path);
    file.delete();
}