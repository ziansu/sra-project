@java.lang.Override
public void onCreate() {
    super.onCreate();
    android.content.IntentFilter filter = new android.content.IntentFilter(android.content.Intent.ACTION_SCREEN_ON);
    filter.addAction(Intent.ACTION_SCREEN_OFF);
    registerReceiver(mReceiver, filter);
}