@java.lang.Override
protected void onDestroy() {
    super.onDestroy();
    com.spotify.sdk.android.player.Spotify.destroyPlayer(this);
    super.onDestroy();
}