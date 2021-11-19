public static java.lang.String checkAndMkdirs(java.lang.String dir) {
    java.io.File file = new java.io.File(dir);
    if (!(file.exists())) {
        file.mkdirs();
    }
    return dir;
}