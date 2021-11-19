public void startPreviousAudio() {
    this.audioFile = getPreviousAudioFile();
    tearDownAudioPlayback();
    setUpAudioPlayback();
    setUpAudioMetadata();
}