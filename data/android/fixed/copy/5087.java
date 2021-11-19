@java.lang.Override
public void connectionLost(java.lang.Throwable arg0) {
    mClient = null;
    statusIcon(false);
    if (isNetworkAvailable()) {
        forceReconnect();
    }
}