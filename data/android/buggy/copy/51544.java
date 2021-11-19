@butterknife.OnClick(value = R.id.playTrackPlayButton)
public void onPlayButtonPress() {
    android.util.Log.v(io.crispcode.spotifystreamer.PlayTrackFragment.LOG_TAG, "Play button was pressed");
    mStreamPlayerService.play();
    mPlayButtonDown = true;
    configureUIState();
}