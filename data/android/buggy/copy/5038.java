@java.lang.Override
public void onError(java.lang.Throwable e) {
    s.onError(e);
    unsubscribe();
}