public void changeStateSong() {
    if (mPlayer.isPlaying()) {
        isPlaying = false;
        mPlayer.pause();
    }else {
        mPlayer.start();
    }
}