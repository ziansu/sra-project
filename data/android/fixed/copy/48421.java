@java.lang.Override
public void run() {
    updateConnectionState();
    connectionStatusHandler.postDelayed(this, updatePeriodMilliSeconds);
}