public static void createParentDirsOfFile(java.io.File file) throws java.io.IOException {
    java.io.File parentDir = file.getParentFile();
    address.util.FileUtil.createDirs(parentDir);
}