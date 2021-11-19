public void destroyAudioPlayer() {
    if ((mAudioPlayer) != null) {
        wycliffeassociates.recordingapp.widgets.AudioPlayer ap = mAudioPlayer.get();
        ap.cleanup();
        mAudioPlayer = null;
    }
}