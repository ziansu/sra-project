@java.lang.Override
protected void onStop() {
    super.onStop();
    if ((org.gtlp.yasb.SoundActivity.soundPlayerInstance.get()) != null) {
        org.gtlp.yasb.SoundActivity.soundPlayerInstance.get().release();
        org.gtlp.yasb.SoundActivity.soundPlayerInstance.set(null);
    }
}