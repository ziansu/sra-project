private android.media.AudioTrack getAudioTrack(int bufferSize) {
    android.media.AudioTrack audioTrack = new android.media.AudioTrack(android.media.AudioManager.STREAM_MUSIC, 44100, android.media.AudioFormat.CHANNEL_OUT_MONO, android.media.AudioFormat.ENCODING_PCM_16BIT, bufferSize, android.media.AudioTrack.MODE_STATIC);
    return audioTrack;
}