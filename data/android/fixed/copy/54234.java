public int getDeleteSleepDisplay() {
    int deleteSleepDisplay = this.preferences.getDeleteSleepDisplay();
    if (deleteSleepDisplay < 0) {
        deleteSleepDisplay = com.googlecode.cchlib.apps.duplicatefiles.prefs.PreferencesControler.DEFAULT_DELETE_SLEEP_DELAIS;
        this.preferences.setDeleteSleepDisplay(deleteSleepDisplay);
    }
    return deleteSleepDisplay;
}