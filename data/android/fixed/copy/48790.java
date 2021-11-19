public void bleServiceDiscovered(java.lang.String address) {
    android.content.Intent intent = new android.content.Intent(com.hypercryptic.bleware.BLEService.BLE_SERVICE_DISCOVERED);
    intent.putExtra(com.hypercryptic.bleware.BLEService.EXTRA_ADDR, address);
    sendBroadcast(intent);
    requestProcessed(address, RequestType.DISCOVER_SERVICE, true);
}