@java.lang.Override
public void run() {
    refreshSessionTime(timestamp);
    inForeground = false;
    if (flushEventsOnClose) {
        updateServer();
    }
}