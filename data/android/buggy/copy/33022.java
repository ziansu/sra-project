@java.lang.Override
protected void onStop() {
    super.onStop();
    if ((org.gtlp.yasb.SoundActivity.soundPlayerInstance) != null) {
        org.gtlp.yasb.SoundActivity.soundPlayerInstance.release();
        org.gtlp.yasb.SoundActivity.soundPlayerInstance = null;
    }
}