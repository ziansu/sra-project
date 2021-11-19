@java.lang.Override
public void onCreate() {
    super.onCreate();
    com.squareup.leakcanary.LeakCanary.install(this);
    buildDepencyGraph();
}