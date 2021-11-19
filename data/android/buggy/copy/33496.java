@java.lang.Override
public void onError(java.lang.Throwable e) {
    completed = true;
    innerError(e);
}