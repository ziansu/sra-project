@java.lang.Override
public android.os.IBinder onBind(android.content.Intent intent) {
    android.util.Log.d(Constants.DEBUG_TAG, "NotificationService : onBind");
    return mBinder;
}