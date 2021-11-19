public void started(java.util.List<java.lang.String> initialNames) {
    if ((started) == null) {
        this.started = new org.jitsi.jigasi.transcription.Transcript.TranscriptEvent(java.time.Instant.now());
        this.initialParticipantNames.addAll(initialNames);
    }
}