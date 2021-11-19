protected void performPlayPause() {
    if ((isPlaying()) || (pausedForFocusLoss)) {
        pausedForFocusLoss = false;
        performPause();
    }else {
        performPlay();
    }
    updateRemoteViews();
    updateNotification();
}