@java.lang.Override
public void execute() {
    if ((gameUI) == null) {
        gameUI = new DrawGame();
    }
    gameUI.show();
    while (true) {
        t.read();
    } 
}