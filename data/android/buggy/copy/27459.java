private void handleTrackClick() {
    contextproject.models.Track selectedTrack = getSelectedTrack();
    contextproject.models.Track nextTrack = getNextTrack(selectedTrack);
    prepareNextTrackTransition(nextTrack);
    playTrack(selectedTrack);
    updateTracks(selectedTrack, nextTrack);
}