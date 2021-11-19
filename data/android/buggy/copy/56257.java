@java.lang.Override
public void onNext(rx.Notification<T> t) {
    if (t.isOnError())
        child.onError(t.getThrowable());
    else {
        isLocked.set(false);
        filteredTerminals.onNext(t);
    }
}