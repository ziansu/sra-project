private void stopNotificationThread() {
    if (((this.notifierTimer) != null) && (this.notifierTimer.$missing$)) {
        android.util.Log.d(IotConstants.LOG_TAG, "stopping notification timer");
        this.notifierTimer.cancel();
    }
}