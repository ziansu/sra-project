@java.lang.Override
public void run() {
    application.EnvironmentGUIPane pane = new application.EnvironmentGUIPane();
    pane.startLevel(Main.currentLevel);
    Main.scene.setRoot(pane);
}