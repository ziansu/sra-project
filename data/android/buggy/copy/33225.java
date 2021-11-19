@java.lang.Override
public void onStopTrackingTouch(android.widget.SeekBar seekBar) {
    if ((currentTime) == (song.getSongDuration())) {
    }else {
        seekTo(currentTime);
    }
    updateSeekbar();
}