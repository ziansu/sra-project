@java.lang.Override
public void onPause() {
    super.onPause();
    android.util.Log.d(com.vpaliy.melophile.playback.PlaybackManager.TAG, "onPlay");
    handlePauseRequest();
}