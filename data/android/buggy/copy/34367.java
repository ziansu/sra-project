@java.lang.Override
public void onCreate() {
    super.onCreate();
    org.acra.ACRA.init(this);
    log("OnCreate Application");
    init();
}