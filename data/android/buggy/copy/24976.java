@java.lang.Override
public void onStartTrackingTouch(android.widget.SeekBar seekBar) {
    isOriginallyPlaying = mPlayer.isPlaying();
}