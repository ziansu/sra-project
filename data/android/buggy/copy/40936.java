private int maxAdvertiseInstances() {
    com.android.bluetooth.btservice.AdapterService adapter = com.android.bluetooth.btservice.AdapterService.getAdapterService();
    int numOfAdvtInstances = adapter.getNumOfAdvertisementInstancesSupported();
    return numOfAdvtInstances - 1;
}