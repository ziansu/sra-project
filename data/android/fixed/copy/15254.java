@java.lang.Override
public void run() {
    if ((stoppedAt) == 0) {
        reconnectIfStale();
    }
}