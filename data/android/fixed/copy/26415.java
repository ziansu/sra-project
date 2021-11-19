private void stopTalking() {
    if ((mCountdownTimer) != null) {
        mCountdownTimer.cancel();
    }
    shouldSpeak = false;
}