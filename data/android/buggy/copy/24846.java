@java.lang.Override
public void run() {
    mCurrentPosition -= com.harlie.radiotheater.radiomysterytheater.AutoplayActivity.THIRTY_SECONDS;
    getRadioMediaController().getTransportControls().seekTo(mCurrentPosition);
}