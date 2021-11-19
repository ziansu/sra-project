private android.content.Intent GetBatteryStatusIntent() {
    android.content.IntentFilter ifilter = new android.content.IntentFilter(android.content.Intent.ACTION_BATTERY_CHANGED);
    android.content.Intent batteryStatus = context.registerReceiver(null, ifilter);
}