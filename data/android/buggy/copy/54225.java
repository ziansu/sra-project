private void stopBackgroundThread() {
    backgroundThread.quitSafely();
    backgroundThread = null;
    backgroundHandler = null;
}