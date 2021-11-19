private void stopPlayback() {
    if ((mplayer) != null) {
        mplayer.release();
        mplayer = null;
    }
}