@java.lang.Override
protected void onDestroy() {
    dttv.app.utils.Log.i(TAG, "enter onDestroy");
    mMediaPlayer.stop();
    mMediaPlayer.release();
    mMediaPlayer = null;
    super.onDestroy();
}