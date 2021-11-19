@java.lang.Override
public void onStopTrackingTouch(android.widget.SeekBar seekBar) {
    if ((oldState) && ((org.gtlp.yasb.SoundActivity.soundPlayerInstance) != null))
        org.gtlp.yasb.SoundActivity.soundPlayerInstance.start();
    
}