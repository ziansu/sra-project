@java.lang.Override
public void onCreate() {
    super.onCreate();
    com.flatstack.android.App.appContext = this;
    timber.log.Timber.plant((BuildConfig.DEBUG ? new timber.log.Timber.DebugTree() : new com.flatstack.android.utils.TimberCrashReportingTree()));
}