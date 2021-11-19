@java.lang.Override
public void setRssi(int rssi) {
    increaseVersion();
    this.rssi = java.lang.Math.abs(rssi);
    this.distanceMeters = ucc.RssiUCC.getDistanceFromRssi(rssi);
}