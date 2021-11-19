@java.lang.Override
protected void onNewIntent(android.content.Intent intent) {
    super.onNewIntent(intent);
    nuclei3.notifications.NotificationManager manager = nuclei3.notifications.NotificationManager.getInstance();
    if (manager != null)
        manager.dismiss(intent);
    
}