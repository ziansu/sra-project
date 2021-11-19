public java.lang.String getLatestVersionLastUpdate() {
    if ((this.latestVersionLastUpdate.equals("N/A")) && ((latestVersion) != null)) {
        getLatestVersion();
    }
    return this.latestVersionLastUpdate;
}