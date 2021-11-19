@java.lang.Override
protected void onBeaconInRange(java.lang.String address, double distance) {
    android.util.Log.d(edu.umass.cs.prepare.metawear.BeaconService.TAG, ("address: " + address));
    android.util.Log.d(edu.umass.cs.prepare.metawear.BeaconService.TAG, ("distance: " + distance));
    serviceManager.startMetawearService(address);
}