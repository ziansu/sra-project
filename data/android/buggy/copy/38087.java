private void startDefaultConsole() {
    try {
        service.Service defaultConsoleService = new console.ConsoleService("Console for me");
        service.Service.startService(defaultConsoleService);
        defaultConsoleService.addObserver(this);
    } catch (service.Service.AlreadyStartException e) {
        master.MasterConsole.log.debug("AlreadyStartException", e);
    }
}