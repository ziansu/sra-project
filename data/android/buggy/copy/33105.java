public void checkConfigVersion() {
    if ((de.codehat.signcolors.SignColors.CONFIG_VERSION) > (this.getConfig().getInt("configversion"))) {
        backupConfig();
        backupLanguages();
        loadConfig();
    }
}