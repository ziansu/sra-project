@java.lang.Override
public void onStop() {
    super.onStop();
    if ((mMediaPlayer) != null) {
        mMediaPlayer.release();
        mMediaPlayer = null;
    }
}