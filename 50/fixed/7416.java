public void stopBackgroundMusic() {
    if ((bgMediaPlayer) != null) {
        bgMediaPlayer.stop();
        bgMediaPlayer.release();
        bgMediaPlayer = null;
    }
}