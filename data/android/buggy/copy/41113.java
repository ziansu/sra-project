public void onClick(android.content.DialogInterface dialog, int which) {
    dialog.dismiss();
    com.wpam.scrabble.mobile.bt.BluetoothManager.getInstance().startDiscovery();
    com.wpam.scrabble.mobile.bt.BluetoothManager.getInstance().cancelDiscovery();
}