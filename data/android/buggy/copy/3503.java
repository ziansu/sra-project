@java.lang.Override
public void onStartTrackingTouch(android.widget.SeekBar seekBar) {
    mediaPlayerPosition = seekBar.getThumbOffset();
    manageMediaPlayer(com.podraza.android.spotifystreamer.NowPlayingActivityFragment.ACTION_SEEK);
}