public boolean isPlaying() {
    return ((mVideoDecoder.getState()) == (com.tanosys.videolibrary.MediaDecoder.STATE_PLAYING)) || ((mAudioDecoder.getState()) == (com.tanosys.videolibrary.MediaDecoder.STATE_PLAYING));
}