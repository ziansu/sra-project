private int calculateFilteredRssi(int rssi, int prevRssi) {
    return ((int) (((Const.BeaconConst.LOW_PASS_FILTER_ALPHA) * rssi) + (1 - ((Const.BeaconConst.LOW_PASS_FILTER_ALPHA) * prevRssi))));
}