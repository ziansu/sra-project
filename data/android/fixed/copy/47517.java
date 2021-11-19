private void copyFileAlways(java.lang.String fileToCheck) throws java.io.IOException {
    java.io.File fileResource = new java.io.File(dashboardFolderPath, fileToCheck);
    org.apache.commons.io.FileUtils.copyFile(localResourceAsFile(fileToCheck), fileResource);
}