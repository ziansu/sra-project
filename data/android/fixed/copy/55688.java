public static java.io.File createNewFile(java.lang.String fileName) throws java.io.IOException {
    java.lang.String path = (com.exalttech.trex.util.files.FileManager.getProfilesFilePath()) + fileName;
    java.io.File newFile = new java.io.File(path);
    newFile.createNewFile();
    return newFile;
}