@java.lang.Override
public void run() {
    utility.ReadConfig reader = new utility.ReadConfig();
    new launcher.LauncherGUI(true, reader.readPropertyBool(ReadConfig.WIDGETS));
}