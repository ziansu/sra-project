private void replacePlayingSong() {
    int index = _activePlaylist.indexOf(_playingSong);
    _activePlaylist.add(index, _playingSong.makeClone());
    _activePlaylist.remove(index);
}