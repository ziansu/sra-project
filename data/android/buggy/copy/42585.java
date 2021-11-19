private void startNewSession(long timestamp, boolean synchronous) {
    if (trackingSessionEvents) {
        sendSessionEvent(com.amplitude.api.AmplitudeClient.END_SESSION_EVENT, synchronous);
    }
    setSessionId(timestamp);
    refreshSessionTime(timestamp);
    if (trackingSessionEvents) {
        sendSessionEvent(com.amplitude.api.AmplitudeClient.START_SESSION_EVENT, synchronous);
    }
}