private void setupPlayer() {
    android.util.Log.v(Constants.LOG_TAG, "Setting up the player...");
    uk.co.qubitssolutions.bharatradios.app.services.BackgroundAudioPlayerService.audioPlayer.initPlayer();
    acquireWakeLock();
    acquireWifiLock();
    setupAudioFocus();
    android.util.Log.v(Constants.LOG_TAG, "Player setup successfully");
}