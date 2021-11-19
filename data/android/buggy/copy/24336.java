@java.lang.Override
public void run() {
    violationSyncHandler.post(violationSync);
    android.util.Log.d("ViolationSyncTask:", "started");
}