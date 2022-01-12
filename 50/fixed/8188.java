public static boolean createDirFileWithoutFileName(java.lang.String path) {
    java.io.File dir = new java.io.File(path);
    if (!(dir.exists())) {
        return dir.mkdirs();
    }
    return true;
}