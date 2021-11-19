public static java.lang.String getModifiedFilePath(java.lang.String filePath) {
    if (!(java.lang.System.getProperty("os.name").contains("mac")))
        return filePath.replaceAll("[/]", "\\\\");
    
    return filePath;
}