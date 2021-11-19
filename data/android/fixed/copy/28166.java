public static void createParentDirsOfFile(java.io.File file) throws java.io.IOException {
    java.io.File parentDir = file.getParentFile();
    if (parentDir != null) {
        address.util.FileUtil.createDirs(parentDir);
    }
}