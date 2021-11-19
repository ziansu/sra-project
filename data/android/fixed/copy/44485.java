public void resumeBackgroundMusic() {
    if ((bgMediaPlayer) != null) {
        if ((bgMediaPlayer.isPlaying()) == false) {
            bgMediaPlayer.seekTo(bgPos);
            bgMediaPlayer.start();
        }
    }
}