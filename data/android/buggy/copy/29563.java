private void handleMoveDown() {
    if (!(moveThreadRunning)) {
        move();
        startRepeatThread();
    }
}