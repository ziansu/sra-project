@java.lang.Override
public void onCreate() {
    super.onCreate();
    com.moldedbits.ottoruntimesubscriptions.BaseApplication.sInstance = this;
    if (BuildConfig.DEBUG) {
        timber.log.Timber.plant(new timber.log.Timber.DebugTree());
    }
    initDb();
    bus = new com.squareup.otto.Bus();
}