@java.lang.Override
public void call() {
    if (closed.get()) {
        drainPendingAckQueue();
    }
}