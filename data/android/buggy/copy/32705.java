private synchronized void updateTime() {
    currentTime.addSeconds(1);
    checkEvents();
}