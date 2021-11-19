public void restart() {
    mRunning = false;
    try {
        java.lang.Thread.sleep(100);
    } catch (java.lang.InterruptedException e) {
        e.printStackTrace();
    }
    mRunning = true;
    handling();
    listen();
}