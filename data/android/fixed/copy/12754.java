public void launch(android.view.View view) {
    if (mIsArtistRadio) {
        requestArtistRadio();
    }else {
        requestVibedPlaylist();
    }
}