public void onItemClick(android.widget.AdapterView<?> av, android.view.View v, int arg2, long arg3) {
    address = mPairedDeviceAddressList.get(arg2).toString();
    new com.kanykei.slcs.ConnectToArduinoWithBluetooth.ConnectBT().execute();
}