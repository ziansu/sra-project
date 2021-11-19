public void resumeMedia() {
    if (!(mediaPlayer.isPlaying())) {
        mediaPlayer.seekTo(resumePosition);
        mediaPlayer.start();
    }
}