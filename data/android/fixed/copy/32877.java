@java.lang.Override
public void onPause() {
    if ((bluetoothScanner) != null) {
        bluetoothScanner.stopScan(scanCallback);
    }
    nfcAdapter.disableForegroundDispatch(this);
    super.onPause();
}