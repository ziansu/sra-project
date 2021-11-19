@java.lang.Override
public void onReceive(android.content.Context context, android.content.Intent intent) {
    ch.bailu.aat.helpers.AppLog.i(context, ch.bailu.aat.helpers.AppBroadcaster.getFile(intent));
}