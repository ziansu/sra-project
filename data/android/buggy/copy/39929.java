private void changeTrack(boolean forward) {
    grooveberryserver.readingqueue.ReadingQueueManager.TrackFlags previousTrackFlags = new grooveberryserver.readingqueue.ReadingQueueManager.TrackFlags(readingQueue.getCurrentTrack());
    endCurrentTrack(previousTrackFlags);
    changeCurrentTrack(forward, previousTrackFlags);
    changeCurrentTrackStatus(previousTrackFlags);
}