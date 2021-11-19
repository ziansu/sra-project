public void play() {
    int frameSize = audioStream.getFormat().getFrameSize();
    if (isLoaded) {
        audioStream.resetReadHead();
        isPlaying = true;
    }
}