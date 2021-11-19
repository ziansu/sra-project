public java.util.List<com.arjanvlek.cyngnotainfo.Model.Device> getDevices() {
    fetchDataFromServer("device");
    if (offline) {
        return offlineDevices;
    }else {
        return devices;
    }
}