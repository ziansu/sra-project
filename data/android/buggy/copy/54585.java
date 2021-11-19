@java.lang.Override
public void onCreate() {
    super.onCreate();
    acr.browser.lightning.app.BrowserApp.context = getApplicationContext();
    com.squareup.leakcanary.LeakCanary.install(this);
    buildDepencyGraph();
}