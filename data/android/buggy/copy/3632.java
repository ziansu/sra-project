private synchronized boolean playTrackOfPlaylist(int playListId, int trackId) {
    trackQueue.setPlaylist(playListId);
    trackQueue.setCurrentTrack(trackId);
    return playCurrentTrack();
}