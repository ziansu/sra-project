@java.lang.Override
public void surfaceDestroyed(android.view.SurfaceHolder holder) {
    this.holder = null;
    if (((mMediaPlayer) != null) && (mMediaPlayer.isPlaying())) {
        releaseMediaPlayer();
        videoPauseFlag = true;
    }
}