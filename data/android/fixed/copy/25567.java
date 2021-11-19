@java.lang.Override
public void onPlayerError(com.google.android.exoplayer2.ExoPlaybackException e) {
    android.util.Log.d(com.liteon.iview.VideoPlayEX.TAG, "[onPlayerStateChanged]  onPlayerError");
    android.widget.Toast.makeText(getApplicationContext(), e.toString(), Toast.LENGTH_SHORT).show();
    onBackPressed();
}