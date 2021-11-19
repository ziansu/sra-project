public static void deleteFile(java.io.File file) throws java.io.IOException {
    if ((file == null) || (file.exists()))
        throw new java.io.IOException("(Method deleteFileIfExist) file is null or not exist.");
    else
        org.apache.commons.io.FileUtils.forceDelete(file);
    
}