public com.nano.karen.SpotifyStreamer.TrackListItem selectNextTrack() {
    if ((curTrackIndex) == (MAX_TRACK))
        curTrackIndex = 0;
    else
        (curTrackIndex)++;
    
    return mTracksAdapter.getItem(curTrackIndex);
}