private void fail(final com.microsoft.thrifty.service.MethodCall<?> call, final java.lang.Throwable error) {
    callbackExecutor.submit(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            call.callback.onError(error);
        }
    });
}