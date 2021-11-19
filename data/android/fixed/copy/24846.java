@java.lang.Override
public void run() {
    if ((getRadioMediaController()) != null) {
        mCurrentPosition -= com.harlie.radiotheater.radiomysterytheater.AutoplayActivity.THIRTY_SECONDS;
        getRadioMediaController().getTransportControls().seekTo(mCurrentPosition);
    }
}