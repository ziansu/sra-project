public void setMusicUrls(java.util.List<java.lang.String> music) {
    musicUrls = music;
    TOR = new android.os.Parcelable.Creator<com.example.seanholcomb.spotifystreamer.ArtistParcel>() {
        {
        }
    };
}