@java.lang.Override
public void onCreate() {
    super.onCreate();
    mNotificationManager = ((android.app.NotificationManager) (getSystemService(Context.NOTIFICATION_SERVICE)));
    android.util.Log.d(Constants.DEBUG_TAG, "NotificationService : onCreate");
    setState("start");
}