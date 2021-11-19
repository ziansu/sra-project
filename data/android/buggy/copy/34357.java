@java.lang.Override
public void onReceive(android.content.Context context, android.content.Intent intent) {
    final java.lang.String action = intent.getAction();
    if ((action.equals(Intent.ACTION_TIME_CHANGED)) || (action.equals(Intent.ACTION_TIMEZONE_CHANGED))) {
        updateDesktopClock();
    }
}