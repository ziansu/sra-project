void restartSong() {
    replaceTrack(_currentlyPlayingTrack);
    _player.startTrack(_currentlyPlayingTrack, false);
}