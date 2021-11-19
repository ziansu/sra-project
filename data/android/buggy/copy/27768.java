public void stopPlayback() {
    if (isAudioTrackInitialised()) {
        if ((isPlaying()) || (isPaused())) {
            android.util.Log.d(ch.zhaw.bait17.audio_signal_processing_toolbox.player.AudioPlayer.TAG, "Stop playback.");
            keepPlaying = false;
        }
    }
}