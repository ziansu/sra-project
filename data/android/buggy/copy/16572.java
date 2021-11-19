public static boolean isFile(java.io.File file) {
    return file == null ? false : file.isDirectory();
}