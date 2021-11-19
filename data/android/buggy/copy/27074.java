private static void loadSettings() {
    edu.flash3388.flashlib.util.ConstantsHandler.loadConstantsFromXml(edu.flash3388.flashlib.dashboard.Dashboard.SETTINGS_FILE);
    try {
        edu.flash3388.flashlib.dashboard.Remote.loadHosts(edu.flash3388.flashlib.dashboard.Dashboard.REMOTE_HOSTS_FILE);
    } catch (java.lang.NullPointerException | java.io.IOException e) {
        edu.flash3388.flashlib.dashboard.Dashboard.log.reportError(e.getMessage());
    }
}