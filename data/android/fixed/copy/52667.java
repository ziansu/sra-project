private void handlePlaybackException(java.lang.Throwable exception) {
    emitter.onError(exception);
    haltPlayback();
}