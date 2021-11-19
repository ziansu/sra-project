private void resetMediaPlayer() {
    if (mMediaPlayer.isPlaying()) {
        mMediaPlayer.stop();
    }
    mMediaPlayer = new android.media.MediaPlayer();
}