public void onPause() {
    currentPos = mMyMediaplayer.getCurrentPosition();
    mMyMediaplayer.pause();
}