@java.lang.Override
public void onServiceDisconnected(android.content.ComponentName name) {
    android.util.Log.i(com.example.dscs.StartFragment.TAG, "Service is disconnected.");
    mBinder = null;
    refreshButtonState(false);
}