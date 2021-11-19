@java.lang.Override
public void onPause(boolean multitasking) {
    super.onPause(multitasking);
    com.plugin.gcm.PushPlugin.gForeground = false;
    final android.app.NotificationManager notificationManager = ((android.app.NotificationManager) (cordova.getActivity().getSystemService(Context.NOTIFICATION_SERVICE)));
    notificationManager.cancelAll();
}