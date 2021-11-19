public void halt() {
    mPlayer.stop();
    stopForeground(true);
    dis_notifyStatus();
}