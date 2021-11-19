@java.lang.Override
protected void onResume() {
    super.onResume();
    gotDevice = false;
    if (!(Utils.isWifiConnection())) {
    }
    attemptDiscovery();
    pebble.pebbleaction(tv.piratemedia.lightcontroler.controller.ctx, tv.piratemedia.lightcontroler.controller.dataReceiver);
}