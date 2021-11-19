@java.lang.Override
public void onStartFailure(int errorCode) {
    super.onStartFailure(errorCode);
    android.util.Log.e("BLE", ("Advertising onStartFailure: " + errorCode));
}