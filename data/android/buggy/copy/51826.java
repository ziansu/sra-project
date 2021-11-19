@java.lang.Override
public boolean captureStatus() {
    synchronized(captureStatus) {
        return captureStatus;
    }
}