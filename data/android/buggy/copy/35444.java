public void stopScan() {
    deviceList.clear();
    if ((scanner) != null)
        scanner.stopScan(populateDevices);
    
}