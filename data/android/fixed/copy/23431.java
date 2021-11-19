private void setupExceptionHandling() {
    onException(org.apache.camel.http.common.HttpOperationFailedException.class).process(new processors.TimeoutExceptionHandler()).handled(true);
}