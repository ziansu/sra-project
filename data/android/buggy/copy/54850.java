@java.lang.Override
public void onCreate() {
    super.onCreate();
    com.winsonchiu.reader.CustomApplication.application = this;
    refWatcher = com.squareup.leakcanary.LeakCanary.install(this);
    componentMain = com.winsonchiu.reader.dagger.components.DaggerComponentMain.builder().build();
    com.winsonchiu.reader.AppSettings.initPrefs(getApplicationContext());
}