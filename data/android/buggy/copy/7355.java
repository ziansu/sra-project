@java.lang.Override
public void onPause() {
    bluetoothScanner.stopScan(scanCallback);
    nfcAdapter.disableForegroundDispatch(this);
    resultsAdapter.clearScanResults();
    resultsReporter.disconnect();
    super.onPause();
}