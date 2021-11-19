private static void createDirectory(java.lang.String folderName, java.lang.String path) {
    new java.io.File((path + folderName)).mkdirs();
}