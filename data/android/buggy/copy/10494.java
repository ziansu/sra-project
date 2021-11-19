@java.lang.Override
public void onCompleted(boolean success, java.lang.String result, java.lang.Throwable throwable) {
    if ((ai.decrementAndGet()) == 0) {
        lock.openAll();
    }
}