public void setRunning(boolean run) {
    if (run) {
        run();
    }else {
        running.set(false);
    }
}