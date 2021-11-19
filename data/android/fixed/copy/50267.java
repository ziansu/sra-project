@java.lang.Override
public void surfaceDestroyed(android.view.SurfaceHolder surfaceHolder) {
    boolean startAgain = true;
    snakeThread.setRunning(false);
    while (startAgain) {
        try {
            snakeThread.join();
            startAgain = false;
        } catch (java.lang.InterruptedException e) {
        }
    } 
}