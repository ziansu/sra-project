@java.lang.Override
public void onNewIntent(android.content.Intent intent) {
    super.onNewIntent(intent);
    com.facebook.notifications.NotificationsManager.presentCardFromNotification(cordova.getActivity());
}