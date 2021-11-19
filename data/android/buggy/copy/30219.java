@java.lang.Override
protected void onPause() {
    super.onPause();
    scanLeDevice(false);
    mLeDeviceListAdapter.clear();
    if ((isRecieverRgistered) == true) {
        unregisterReceiver(mGattUpdateReceiver);
        isRecieverRgistered = false;
    }
}