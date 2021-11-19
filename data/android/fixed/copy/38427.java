private boolean requestFocus() {
    int result = mAudioManager.requestAudioFocus(this, AudioManager.STREAM_MUSIC, AudioManager.AUDIOFOCUS_GAIN);
    if (result == (android.media.AudioManager.AUDIOFOCUS_REQUEST_GRANTED)) {
        return true;
    }else {
        return false;
    }
}