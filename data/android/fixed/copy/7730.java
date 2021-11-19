private void startTimer() {
    if ((timer) == null) {
        timer = new java.util.Timer();
        timer.schedule(task, 0, 1000);
    }
}