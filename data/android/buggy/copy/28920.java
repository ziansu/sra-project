public kaaes.spotify.webapi.android.models.Track getTrack() {
    if ((track) == null) {
        android.util.Log.d(MainActivity.TAG, "getting new empty track");
        track = new com.tbse.nano.nano_proj_1_spotify_streamer.models.MyTrack();
    }
    return track;
}