@java.lang.Override
protected void onPause() {
    beaconManager.stopRanging(welten);
    super.onPause();
    mCardScroller1.deactivate();
}