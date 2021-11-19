private void replacePlayingSong() {
    _activePlaylist.add(_activePlaylist.indexOf(_playingSong), _playingSong.makeClone());
}