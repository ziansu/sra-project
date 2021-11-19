public static java.io.File createNewFile(java.lang.String fileName) throws java.io.IOException {
    java.io.File newFile = new java.io.File(((com.exalttech.trex.util.files.FileManager.getProfilesFilePath()) + fileName));
    newFile.createNewFile();
    return newFile;
}