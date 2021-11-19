public int getMax() {
    if ((mMediaPlayer) != null) {
        return mMediaPlayer.getDuration();
    }
    return 1;
}