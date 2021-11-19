@java.lang.Override
public void onCreate() {
    super.onCreate();
    timber.log.Timber.plant((BuildConfig.DEBUG ? new timber.log.Timber.DebugTree() : new com.flatstack.android.utils.TimberCrashReportingTree()));
}