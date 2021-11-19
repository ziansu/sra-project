@java.lang.Override
public void onError(java.lang.Throwable e) {
    if (!(completed)) {
        completed = true;
        innerError(e, true);
    }
}