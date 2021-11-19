@java.lang.Override
public void init() throws java.lang.Exception {
    address.MainApp.logger.info("Initializing app ...");
    super.init();
    initConfig();
    initPrefs();
    initComponents();
}