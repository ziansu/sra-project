@java.lang.Override
public void onStartTrackingTouch(android.widget.SeekBar seekBar) {
    if ((org.gtlp.yasb.SoundActivity.soundPlayerInstance.get()) != null) {
        oldState = org.gtlp.yasb.SoundActivity.soundPlayerInstance.get().isPlaying();
        org.gtlp.yasb.SoundActivity.soundPlayerInstance.get().pause();
    }
}