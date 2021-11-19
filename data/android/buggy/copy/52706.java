@java.lang.Override
public void stop() {
    prefs.updateLastUsedGuiSetting(mainWindow.getCurrentGuiSetting());
    mainWindow.hide();
    mainWindow.releaseResources();
}