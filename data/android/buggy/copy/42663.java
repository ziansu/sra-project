@java.lang.Override
public void run() {
    boolean success = bluetoothUtilities.establishConnection();
    if (!success) {
        log("Waiting 60 seconds before retry");
    }else {
        mBluetoothRetryTimer.cancel();
    }
}