public kaaes.spotify.webapi.android.models.Track getTrack() {
    if ((track) == null) {
        android.util.Log.d(MainActivity.TAG, "getting new empty track");
        track = new kaaes.spotify.webapi.android.models.Track();
    }
    return track;
}