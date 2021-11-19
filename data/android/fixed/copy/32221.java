@java.lang.Override
public void onDestroy() {
    super.onDestroy();
    alarm.cancel(CheckMessagesPendingIntent);
    com.nosideracing.rchipremote.RemoteMain.json.deauthenticate();
    android.util.Log.d(Consts.LOG_TAG, "onDestroy: rchip");
}