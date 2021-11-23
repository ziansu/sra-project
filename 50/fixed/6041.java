private void startReadRequest() {
    currentReadRequest = java.lang.System.currentTimeMillis();
    android.util.Log.i(net.fishandwhistle.openpos.BarcodeReaderActivity.TAG, ("Launching read request " + (currentReadRequest)));
    enableScanning = true;
}