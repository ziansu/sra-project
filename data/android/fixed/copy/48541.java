private void clearUI() {
    dataField.setText("no_data");
    activity.unregisterReceiver(gattUpdateReceiver);
    bluetoothService.disconnect();
    activity.unbindService(serviceConnection);
}