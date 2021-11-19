public void onDestroy() {
    super.onDestroy();
    log.info("Destroying ActivityRecognitionLocationProvider");
    stopRecording();
    disconnectFromPlayAPI();
    unregisterReceiver(detectedActivitiesReceiver);
}