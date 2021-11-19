@java.lang.Override
public void onProgressChanged(android.widget.SeekBar seekBar, int progress, boolean fromUser) {
    if (((mediaPlayer) != null) && fromUser) {
        mediaPlayer.seekTo(progress);
    }
}