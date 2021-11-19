@java.lang.Override
public void run() {
    sSeeking = true;
    mCurrentPosition = newProgress;
    managePlaybackControls(com.harlie.radiotheater.radiomysterytheater.AutoplayActivity.ControlsState.SEEKING_POSITION, "setSeekBarChangeListener");
    getRadioMediaController().getTransportControls().seekTo(newProgress);
}