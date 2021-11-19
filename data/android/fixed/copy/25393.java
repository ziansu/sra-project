@java.lang.Override
protected void onResume() {
    super.onResume();
    gotDevice = false;
    if (!(Utils.isWifiConnection())) {
    }
    attemptDiscovery();
}