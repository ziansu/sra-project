@java.lang.Override
protected void onCancelled() {
    bIsRunning = false;
    if ((listener) != null) {
        listener.onDone(method.getName());
    }
    if ((asyncCallback) != null) {
        asyncCallback.onCancel();
    }
}