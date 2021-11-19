public void seek(double newTime) {
    player.seek(currentSongDuration.multiply((newTime / 100.0)));
}