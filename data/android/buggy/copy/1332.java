public void startTimer() {
    if ((timer) != null)
        return ;
    
    timer = new java.util.Timer();
    initializeTimerTask();
    timer.schedule(timerTask, 5000, 10000);
}