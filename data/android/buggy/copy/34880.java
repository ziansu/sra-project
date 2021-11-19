@java.lang.Override
public void run() {
    this.requestFocus();
    while (game.isRunning()) {
        render();
        try {
            java.lang.Thread.sleep(5);
        } catch (java.lang.InterruptedException ignore) {
        }
    } 
}