public synchronized void unPause() {
    setIdleState(org.robolectric.util.Scheduler.IdleState.UNPAUSED);
}