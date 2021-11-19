public boolean isVideoPlaying() {
    boolean isPlaying = false;
    try {
        isPlaying = currentMediaPlayer.isPlaying();
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
    return isPlaying;
}