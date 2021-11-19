@java.lang.Override
public void onStartTrackingTouch(android.widget.SeekBar seekBar) {
    if (com.hungnt.customlogin.fragments.MusicPlayerFragment.isPlaying)
        seekTime();
    
}