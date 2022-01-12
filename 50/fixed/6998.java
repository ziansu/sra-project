public void addNewDevice(android.support.v4.util.Pair<java.lang.String, java.lang.String> newDevice) {
    if (!(mNewDevices.contains(newDevice))) {
        mNewDevices.add(newDevice);
    }
    notifyDataSetChanged();
}