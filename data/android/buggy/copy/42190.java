@java.lang.Override
public void onCompletion(android.media.MediaPlayer mp) {
    mController.setControllerMode(VideoControllerView.PAUSE_MODE);
    mAnnotationTimer.stop();
}