@java.lang.Override
public void onConnectionSuspended(int i) {
    if ((mmanager) != null) {
        mmanager.reconnect();
        mstarted = false;
    }
}