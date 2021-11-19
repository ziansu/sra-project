@java.lang.Override
public void onProgressChanged(android.widget.SeekBar seekBar, int i, boolean b) {
    mediaPlayer.seekTo(i);
}