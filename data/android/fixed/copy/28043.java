@java.lang.Override
public void call() {
    application.sendBroadcast(new android.content.Intent(android.content.Intent.ACTION_BATTERY_CHANGED).putExtra(BatteryManager.EXTRA_PLUGGED, (-1)));
}