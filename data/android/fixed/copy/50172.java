private void initialise(it.emarolab.cagg.debugging.CaggLoggersManager.LoggersNames names, java.lang.String log4jConfigPath) {
    it.emarolab.cagg.debugging.CaggLoggersManager.setFilePath(null);
    this.names = new it.emarolab.cagg.debugging.CaggLoggersManager.LoggersNames();
    this.log4jConfigPath = log4jConfigPath;
    this.applyAll();
}