@java.lang.Override
public void onCreate() {
    super.onCreate();
    anipr.transtech.android.ApplicationClass.applicationInstance = new anipr.transtech.android.ApplicationClass();
    com.crittercism.app.Crittercism.initialize(getApplicationContext(), "54d8c0e651de5e9f042ed84c");
}