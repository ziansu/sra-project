private synchronized void stop() {
    com.princecoder.nanodegree.spotifytreamer.utils.L.m(LOG_TAG, "stop");
    if (isPrepared) {
        isPrepared = false;
        StopProgressBar();
        mp.stop();
    }
}