private void changeTrack(int increment) {
    mCurrentTrackIndex = ((mCurrentTrackIndex) + increment) % (mTopTracks.size());
    if ((mCurrentTrackIndex) < 0) {
        mCurrentTrackIndex += mTopTracks.size();
    }
    updateView();
}