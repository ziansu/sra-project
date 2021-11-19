@java.lang.Override
public void onConnected(android.os.Bundle bundle) {
    super.onConnected(bundle);
    if (DEBUG)
        android.util.Log.e(com.vibejukebox.jukebox.activities.JukeboxPlaylistActivity.TAG, "onConnected (Playlist Activity)");
    
    updateLocation(mLastLocation);
}