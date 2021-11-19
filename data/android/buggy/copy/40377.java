@java.lang.Override
public void newTrackClicked(int selectedTrack) {
    android.util.Log.v(au.com.kbrsolutions.spotifystreamer.activities.SpotifyStreamerActivity.LOG_TAG, "newTrackClicked - start");
    showPlayerController(selectedTrack);
}