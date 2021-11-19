@java.lang.Override
protected void onPause() {
    super.onPause();
    if (((mediaPlayer) != null) && (mediaPlayer.isPlaying())) {
        mediaPlayer.start();
        myHandler.postDelayed(UpdateSongTime, 100);
    }
}