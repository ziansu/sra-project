public void deactivateRealTimeMode() {
    realTimeMode = false;
    btnCapture.setText(getString(R.string.capture));
    btnCapture.setActivated(true);
}