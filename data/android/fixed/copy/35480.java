@java.lang.Override
protected void onResume() {
    super.onResume();
    onUpdateChange();
    onProgressChange(sdk.getCurrentPlayingMusicPosition(), sdk.getCurrentPlayingMusicDuration());
    loadAlbumImage();
}