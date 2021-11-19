@java.lang.Override
public void onComplete() {
    if (parent.terminate()) {
        actual.onComplete();
    }
}