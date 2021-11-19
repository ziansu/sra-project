public static java.lang.String getModifiedFilePath(java.lang.String filePath) {
    if (!(java.lang.System.getProperty("os.name").toLowerCase().contains("mac")))
        return filePath.replaceAll("[/]", "\\\\");
    
    return filePath;
}