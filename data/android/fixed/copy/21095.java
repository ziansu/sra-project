public void stopPlaying(android.view.View v) {
    if ((mediaPlayer) != null) {
        mediaPlayer.release();
        mediaPlayer = null;
    }
}