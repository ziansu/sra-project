@java.lang.Override
public void onCreate() {
    super.onCreate();
    timeRec = new de.mhid.android.timerecordingforpebble.TimeRecConnector(this);
    initEvents();
    messenger.initReceiver(this);
    android.util.Log.d(this.getClass().getName(), "onCreate()");
}