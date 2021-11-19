@java.lang.Override
protected void onStop() {
    android.util.Log.i(net.videgro.ships.activities.OpenDeviceActivity.TAG, "onStop");
    if ((usbReceiver) != null) {
        unregisterReceiver(usbReceiver);
    }
    super.onStop();
}