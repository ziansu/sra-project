@java.lang.Override
public void onDestroy() {
    super.onDestroy();
    if ((broadcastManager) != null) {
        broadcastManager.unregisterReceiver(com.mbientlab.metawear.api.MetaWearBleService.getMetaWearBroadcastReceiver());
    }
}