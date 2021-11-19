@java.lang.Override
public void onPause() {
    super.onPause();
    android.util.Log.i(com.sparq.application.userinterface.EventActivity.TAG, "onPause");
    if (isReceiverRegistered) {
        unregisterReceiver(timerReceiver);
        isReceiverRegistered = false;
    }
}