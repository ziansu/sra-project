public void pauseMusic() {
    if (mPlayer.isPlaying()) {
        mPlayer.pause();
        length = mPlayer.getCurrentPosition();
    }
}