private boolean requestFocus() {
    return (android.media.AudioManager.AUDIOFOCUS_REQUEST_GRANTED) == (mAudioManager.requestAudioFocus(this, AudioManager.STREAM_MUSIC, AudioManager.AUDIOFOCUS_GAIN));
}