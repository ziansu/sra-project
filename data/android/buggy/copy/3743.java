private boolean isEmulatorUpdateToDate() throws java.io.IOException, java.lang.InterruptedException {
    java.lang.String currentVersion = installedEmulatorVersion(versionPrefix);
    return (currentVersion.compareTo(minVersion)) >= 0;
}