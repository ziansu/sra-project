@java.lang.Override
public void surfaceChanged(android.view.SurfaceHolder holder, int format, int w, int h) {
    android.util.Log.i("guoli", "========surfaceChanged =============");
    if (needToResetMovieRatio) {
        mDisplaySizeMode = MediaPlayerMovieRatioView.MOVIE_RATIO_MODE_16_9;
        mMediaPlayerVideoView.setVideoLayout(mDisplaySizeMode);
        needToResetMovieRatio = false;
    }
}