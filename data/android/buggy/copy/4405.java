@java.lang.Override
public void onProgressChanged(android.widget.SeekBar seekBar, int i, boolean b) {
    if (((mediaPlayer) != null) && b) {
        mediaPlayer.seekTo(i);
        pauseLength = mediaPlayer.getCurrentPosition();
    }
}