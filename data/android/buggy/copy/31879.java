@java.lang.Override
public void onStopTrackingTouch(android.widget.SeekBar seekBar) {
    int progress = seekBar.getProgress();
    tvStart.setText(com.example.d038395.audioupanddown.MyUtils.formatMilliToHMS(progress));
    mediaPlayer.seekTo(progress);
}