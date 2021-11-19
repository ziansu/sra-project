private void handleTrackClick() {
    contextproject.models.Track selectedTrack = getSelectedTrack();
    contextproject.models.Track nextTrack = getNextTrack(selectedTrack);
    playTrack(selectedTrack);
    prepareNextTrackTransition(nextTrack);
    updateTracks(selectedTrack, nextTrack);
}