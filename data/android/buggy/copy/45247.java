@java.lang.Override
protected void onStart() {
    super.onStart();
    _BluetoothUtility = new com.example.user.blueputdroid.BluetoothUtility();
    _BluetoothUtility.start();
}