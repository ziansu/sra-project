@java.lang.Override
public void onStartTrackingTouch(android.widget.SeekBar seekBar) {
    if ((mPlayer) == null)
        return ;
    
    isOriginallyPlaying = mPlayer.isPlaying();
}