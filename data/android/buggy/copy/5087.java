@java.lang.Override
public void connectionLost(java.lang.Throwable arg0) {
    stopKeepAlives();
    mClient = null;
    statusIcon(false);
    if (isNetworkAvailable()) {
        forceReconnect();
    }
}