public void captureAudioChunk(float[] samples, int length) {
    if ((audioSource) != null) {
        audioSource.captureAudioChunk(samples, length);
    }
}