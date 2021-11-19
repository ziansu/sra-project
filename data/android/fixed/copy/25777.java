@java.lang.Override
public android.os.IBinder onBind(android.content.Intent intent) {
    int time = intent.getExtras().getInt(MathActivity.INTENT_EXTRA_MINUTES);
    android.util.Log.i(com.hannah.hannahworld.BroadcastTimeCountService.TAG, ("time" + time));
    return mBinder;
}