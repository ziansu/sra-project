private void copyDirectoryIfMissing(java.lang.String dirToCheck) throws java.io.IOException {
    java.io.File dirResource = new java.io.File(dashboardFolderPath, dirToCheck);
    if (!(dirResource.exists())) {
        org.apache.commons.io.FileUtils.copyDirectory(de.zalando.ep.zalenium.util.DashboardDataHandler.localResourceAsFile(dirToCheck), dirResource);
    }
}