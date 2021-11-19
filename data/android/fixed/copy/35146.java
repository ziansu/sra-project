@java.lang.Override
public void run() {
    notifyInterfaceClassActivity(params.type, DataConnectionRealTimeInfo.DC_POWER_STATE_LOW, android.os.SystemClock.elapsedRealtimeNanos(), true);
}