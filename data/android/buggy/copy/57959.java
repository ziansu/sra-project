public void start() {
    android.util.Log.d(TagConstants.TAG, "play");
    if (!(mediaPlayer.isPlaying())) {
        mediaPlayer.start();
    }
}