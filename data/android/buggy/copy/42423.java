public java.lang.String getOutputDirectory() {
    java.lang.String outputDirectory = ((configuration.Constants.EXTRACTION_PROFILES_DIRECTORY) + (UUID)) + (java.io.File.separator);
    if (!(utility.FileUtils.isDirectory(outputDirectory))) {
        utility.FileUtils.createDirectory(outputDirectory);
    }
    return outputDirectory;
}