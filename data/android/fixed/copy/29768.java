@net.continuumsecurity.steps.Given(value = "a new scanning session")
public void createNewScanSession() {
    app = net.continuumsecurity.Config.getInstance().createApp();
    app.enableHttpLoggingClient();
}