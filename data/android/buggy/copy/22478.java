@java.lang.Override
public boolean isReallyWorking() {
    if ((!(needsBackgroundWork())) || (org.andstatus.app.util.RelativeTime.wasButMoreSecondsAgoThan(previousBeat, ((org.andstatus.app.service.MyService.HeartBeat.HEARTBEAT_PERIOD_SECONDS) + 3)))) {
        return false;
    }
    return true;
}