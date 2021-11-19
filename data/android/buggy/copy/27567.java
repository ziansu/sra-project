@java.lang.Override
public void onError(int error) {
    getLogger().LOGd(nl.dobots.bluenet.ble.extended.BleExt.TAG, "Failed to discover services");
    callback.onError(error);
}