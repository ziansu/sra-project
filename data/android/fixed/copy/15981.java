public void stop() {
    if ((audioTrack) != null) {
        audioTrack.stop();
        audioTrack.release();
        audioTrack = null;
    }
}