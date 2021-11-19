private void consoleSetup() {
    logController = new me.corriekay.pokegoutil.gui.controller.LogController();
    me.corriekay.pokegoutil.utils.logging.ConsolePrintStream.setup(logController);
    setDefaultCharset("UTF8");
}