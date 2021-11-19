@java.lang.Override
public void onReceive(android.content.Context context, android.content.Intent intent) {
    if ((intent.getAction().equals(WifiManager.WIFI_STATE_CHANGED_ACTION)) && (mWifiHelper.isConnectedToWifi())) {
        stop(false);
    }
}