protected void onPause() {
    releaseMediaPlayer(mediaPlayer);
    super.onPause();
}