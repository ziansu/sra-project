@java.lang.Override
protected void onPause() {
    mBarcodePicker.stopScanning();
    mPaused = true;
    super.onPause();
}