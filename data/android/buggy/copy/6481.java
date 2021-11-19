@java.lang.Override
public void run() {
    try {
        result = doWork();
    } catch (org.robolectric.shadows.OperationCanceledException | java.io.IOException | org.robolectric.shadows.AuthenticatorException e) {
        exception = e;
    }
    if ((callback) != null) {
        callback.run(this);
    }
}