public boolean pause() {
    try {
        if ((mp.isLooping()) || (mp.isPlaying())) {
            mp.pause();
            return true;
        }
    } catch (java.lang.IllegalStateException e) {
    }
    return false;
}