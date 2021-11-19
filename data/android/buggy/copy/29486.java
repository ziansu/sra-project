@java.lang.Override
public void onSuccess(java.lang.String deviceId) {
    setStatus(("Device Registered Successfully " + deviceId), true);
    android.util.Log.i(com.ibm.hellopush.MainActivity.TAG, "Successfully registered for push notifications");
    push.listen(notificationListener);
}