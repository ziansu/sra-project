public void startTimer() {
    running = true;
    paused = false;
    runThread = new java.lang.Thread(this);
    runThread.start();
}