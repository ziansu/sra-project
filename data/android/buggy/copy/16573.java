private void releasePlayer() {
    mNotificationManager.cancelAll();
    mExoPlayer.stop();
    mExoPlayer.release();
    mExoPlayer = null;
}