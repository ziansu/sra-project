public static void setSdpInitiatedAddress(android.bluetooth.BluetoothDevice remBtDev) {
    com.android.bluetooth.OolConnManager.mAddress = remBtDev.getAddress();
    android.util.Log.d(com.android.bluetooth.OolConnManager.TAG, ("setSdpInitiatedAddress " + (com.android.bluetooth.OolConnManager.mAddress)));
}