private com.squareup.okhttp.Call performOperation(java.util.concurrent.Callable<com.squareup.okhttp.Call> operation) {
    showProgressBar();
    try {
        return operation.call();
    } catch (java.lang.Exception e) {
        onOperationFailed();
        return null;
    }
}