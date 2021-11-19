@java.lang.Override
public void onConnectionSuspended(int i) {
    mmanager.reconnect();
    mstarted = false;
}