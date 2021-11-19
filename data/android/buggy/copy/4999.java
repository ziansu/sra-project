@java.lang.Override
public void run() {
    application.EnvironmentGUIPane pane = new application.EnvironmentGUIPane();
    Main.scene.setRoot(pane);
    pane.startLevel(Main.currentLevel);
    application.MainMenu.mainMenuTimer.cancel();
}