@java.lang.Override
public void onCreate() {
    super.onCreate();
    appConfig = getAppConfig();
    if (me.xiaonian.mowidroid.kit.ApplicationKit.isMainProcess(this)) {
        getInitializer(this).init();
    }
}