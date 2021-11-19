@java.lang.Override
public void onDestroy() {
    android.util.Log.d(com.hinohunomi.bgbeacon.BeaconService.TAG, "onDestroy");
    unregisterReceiver(broadcastReceiver);
    mActionHandler.abortBeacon();
}