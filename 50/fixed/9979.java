protected void stopAudioPlayback() {
    if ((audioPlayer) != null) {
        audioPlayer.stop();
        audioPlayer.reset();
    }
}