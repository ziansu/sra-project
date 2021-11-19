private void performOperation(java.util.concurrent.Callable<com.squareup.okhttp.Call> operation) {
    showProgressBar();
    try {
        operation.call();
    } catch (java.lang.Exception e) {
        onOperationFailed();
    }
}