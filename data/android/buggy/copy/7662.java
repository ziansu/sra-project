private static void createDirectory(java.lang.String folderName, java.lang.String path) {
    java.lang.String pathName = path;
    new java.io.File((pathName + folderName)).mkdirs();
}