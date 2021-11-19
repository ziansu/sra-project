@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    com.facebook.FacebookSdk.sdkInitialize(getApplicationContext());
    com.facebook.appevents.AppEventsLogger logger = com.facebook.appevents.AppEventsLogger.newLogger(this);
    track_screenView(logger);
}