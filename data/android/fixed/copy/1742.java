public void play() {
    if (isLoaded) {
        audioStream.resetReadHead();
        isPlaying = true;
    }
}