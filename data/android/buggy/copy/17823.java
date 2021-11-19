@java.lang.Override
protected void onNewIntent(android.content.Intent intent) {
    super.onNewIntent(intent);
    setIntent(intent);
    com.facebook.notifications.NotificationsManager.presentCardFromNotification(cordova.getActivity());
}