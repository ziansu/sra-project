@java.lang.Override
public void onStopTrackingTouch(android.widget.SeekBar seekBar) {
    mIsTracking = false;
    mMediaController.getTransportControls().seekTo(getProgress());
}