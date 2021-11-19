@java.lang.Override
public void onStopTrackingTouch(android.widget.SeekBar seekBar) {
    mp.seekTo(seekBar.getProgress());
    android.util.Log.e("test", java.lang.String.valueOf(mp.getDuration()));
}