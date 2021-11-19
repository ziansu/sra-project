public void launch(android.view.View view) {
    android.util.Log.d(com.vibejukebox.jukebox.activities.MusicParameterActivty.TAG, " Start Playlist Launch ");
    if (mIsArtistRadio)
        requestArtistRadio();
    else
        requestVibedPlaylist();
    
}