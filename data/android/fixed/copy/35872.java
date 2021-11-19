public void destroyAudioPlayer() {
    if ((mAudioPlayer) != null) {
        wycliffeassociates.recordingapp.widgets.AudioPlayer ap = mAudioPlayer.get();
        if (ap != null) {
            ap.cleanup();
        }
        mAudioPlayer = null;
    }
}