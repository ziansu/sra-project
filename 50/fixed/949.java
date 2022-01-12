@java.lang.Override
public void onCompletion(android.media.MediaPlayer mp) {
    mHVVideoController.displayPlayImg();
    mHVVideoController.setCurrentTime(0);
    mHVVideoController.setSeekBarProgress(0);
    mHVVideoController.setSeekBarSecondaryProgress(0);
    mHVVideoView.stopTimer();
    mHVVideoView.seekTo(0);
}