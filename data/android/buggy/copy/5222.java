private void playNextSong() {
    (nowPlayingPosition)++;
    nowPlaying = queue.get(this.nowPlayingPosition);
    stop();
    loadSong(nowPlaying);
}