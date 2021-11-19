@java.lang.Override
public void onStartTrackingTouch(android.widget.SeekBar seekBar) {
    if (mp.isPlaying()) {
        pause();
    }
}