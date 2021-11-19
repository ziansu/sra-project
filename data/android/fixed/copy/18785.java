@java.lang.Override
public void onReceive(android.content.Context context, android.content.Intent intent) {
    context.sendBroadcast(new android.content.Intent("NOTIFICATION_DISMISSED"));
}