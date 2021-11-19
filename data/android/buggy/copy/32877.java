@java.lang.Override
public void onPause() {
    bluetoothScanner.stopScan(scanCallback);
    nfcAdapter.disableForegroundDispatch(this);
    super.onPause();
}