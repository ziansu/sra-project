@java.lang.Override
protected void onPause() {
    super.onPause();
    if (((mediaPlayer) != null) && (mediaPlayer.isPlaying())) {
        mediaPlayer.start();
    }
}