private void stopPlaying() {
    mPlayer.release();
    mPlayer = null;
    mStartPlaying = !(mStartPlaying);
    setText("Start playing");
}