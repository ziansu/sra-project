@java.lang.Override
public void cancel(java.lang.Object data) {
    if (sessionId.equals(data)) {
        future.cancel(true);
        finished = true;
    }
}