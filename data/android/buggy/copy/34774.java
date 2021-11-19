public java.util.List<com.google.samples.apps.ibeaconapp.beaconinterface.IBeacon> getIBeacons() {
    java.util.List<com.google.samples.apps.ibeaconapp.beaconinterface.IBeacon> iBeaconsListSorted = new java.util.ArrayList<com.google.samples.apps.ibeaconapp.beaconinterface.IBeacon>();
    iBeaconsListSorted.addAll(iBeacons);
    java.util.Collections.sort(iBeaconsListSorted);
    return iBeaconsListSorted;
}