@java.lang.Override
public void onCreate() {
    super.onCreate();
    com.android.record.RecordApplication.mApplication = this;
    com.android.record.RecordApplication.mContext = getApplicationContext();
}