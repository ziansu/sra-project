@java.lang.Override
public void run() {
    connectionThread.start();
    gameThread.start();
    try {
        gameThread.join();
    } catch (java.lang.InterruptedException ex) {
    }
    checker.setIsGameRunning(false);
}