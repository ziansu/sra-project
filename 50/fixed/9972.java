@java.lang.Override
protected void handleResponse(java.lang.String response) {
    responseLatch.countDown();
}