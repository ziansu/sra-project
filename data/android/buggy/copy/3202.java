@java.lang.Override
public void run() {
    if (!(mScanning))
        return ;
    
    mScanning = false;
    android.util.Log.e(com.nordicid.nurapi.NurDeviceScanner.TAG, "Scanning STOP BLE");
    mBluetoothAdapter.stopLeScan(mLeScanCallback);
    mListener.onScanFinished();
}