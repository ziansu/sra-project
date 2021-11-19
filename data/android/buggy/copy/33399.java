@java.lang.Override
public void handle(javafx.scene.input.KeyEvent keyEvent) {
    java.lang.System.out.println("key pressed");
    core.KioskMain.getTimeout().resetTimer();
}