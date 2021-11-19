@java.lang.Override
public void onReceive(final android.content.Context context, android.content.Intent intent) {
    if (intent.getAction().equals(com.infiniteshield.main.NotificationReceiver.ACTION_STOP)) {
        com.infiniteshield.main.Shield.toggle(context);
    }
}