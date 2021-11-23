@java.lang.Override
public void run() {
    action.doActionAndScheduleNext(player, trackSelector, surface, mainHandler, null);
    clock.postDelayed(mainHandler, this, repeatIntervalMs);
}