@java.lang.Override
public void onCreate() {
    android.util.Log.d(ListviewFragment.LOG_TAG, "onCreate() called from AutoStartUpService");
    super.onCreate();
    oth_regensburg.automaticnewspaperdownloader.AutoStartUpService.InitService(this);
    oth_regensburg.automaticnewspaperdownloader.AutoStartUpService.setAlarm(this, true);
}