public boolean hasActiveStreams() {
    return org.webrtc.AudioTrack.nativeHasActiveStreams(nativeTrack);
}