public void run() {
    fileManager.loadSecondarySettings();
    try {
        pluginManager.load();
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}