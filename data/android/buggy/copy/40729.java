@java.lang.Override
public void onConnected(@android.support.annotation.Nullable
android.os.Bundle bundle) {
    android.util.Log.d(edu.umbc.cs.iot.clients.android.UMBCIoTApplication.getDebugTag(), "Connected to API client");
    subscribe();
}