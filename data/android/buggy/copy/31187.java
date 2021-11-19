public void pause() {
    mPlayer.stop();
    mPlayer.release();
    mPlayer = null;
    setMusicIsPlaying(false);
}