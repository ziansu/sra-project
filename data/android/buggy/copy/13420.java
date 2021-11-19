@java.lang.Override
public void onCreate() {
    android.util.Log.i("Information : ", "開啟打電話功能");
    android.telephony.TelephonyManager manager = ((android.telephony.TelephonyManager) (this.getSystemService(com.project.final_project.TELEPHONY_SERVICE)));
    manager.listen(phoneStateListener, phoneStateListener.LISTEN_CALL_STATE);
    super.onCreate();
}