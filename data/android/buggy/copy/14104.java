@java.lang.Override
public void showNotificationCallback(org.adblockplus.libadblockplus.Notification notification) {
    android.util.Log.d(org.adblockplus.libadblockplus.tests.NotificationTest.TAG, ((((this) + " received [") + notification) + "]"));
    retValue = notification;
}