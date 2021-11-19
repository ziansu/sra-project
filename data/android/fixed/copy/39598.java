@java.lang.Override
public void onCreate() {
    super.onCreate();
    startFayeClient();
    android.util.Log.i(com.elirex.fayeclient.FayeService.LOG_TAG, ("Faye Service Starts: " + (this)));
}