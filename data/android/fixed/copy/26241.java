public void pauseMusic() {
    if ((mPlayer) != null) {
        if (mPlayer.isPlaying()) {
            mPlayer.pause();
            length = mPlayer.getCurrentPosition();
        }
    }
}