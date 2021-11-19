@java.lang.Override
public void onProgressChanged(android.widget.SeekBar seekBar, int i, boolean fromUser) {
    if (fromUser && ((jcAudioPlayer) != null))
        jcAudioPlayer.seekTo(i);
    
}