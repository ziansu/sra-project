@java.lang.Override
protected void onPause() {
    super.onPause();
    stepDetector.onPause();
    this.unregisterReceiver(this.mReceiver);
}