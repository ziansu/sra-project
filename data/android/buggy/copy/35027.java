@java.lang.Override
public void addTranscriptionListener(org.jitsi.jigasi.transcription.TranscriptionListener listener) {
    requestManager.getResponseObserver().addListener(listener);
}