private void stopPeriodicScan() {
    context.unregisterReceiver(scanReceiver);
    periodicScanTimer.cancel();
}