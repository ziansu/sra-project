@java.lang.Override
public void onStopTrackingTouch(android.widget.SeekBar seekBar) {
    if ((currentTime) == (song.getSongDuration())) {
        nextSong();
    }else {
        seekTo(currentTime);
    }
    updateSeekbar();
}