public static void createDirFileWithoutFileName(java.lang.String path) {
    java.io.File dir = new java.io.File(path);
    if (!(dir.exists())) {
        dir.mkdirs();
    }
}