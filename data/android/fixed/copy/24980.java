private void copyDirectoryIfMissing(java.lang.String dirToCheck) throws java.io.IOException {
    java.io.File dirResource = new java.io.File(dashboardFolderPath, dirToCheck);
    if (!(dirResource.exists())) {
        org.apache.commons.io.FileUtils.copyDirectory(localResourceAsFile(dirToCheck), dirResource);
    }
}