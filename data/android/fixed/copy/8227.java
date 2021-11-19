public void playNext() {
    (trackIndex)++;
    if ((trackIndex) >= (resourceList.size())) {
        trackIndex = 0;
    }
    getNextTrack(trackIndex);
}