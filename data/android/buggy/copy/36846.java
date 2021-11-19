@java.lang.Override
protected final void onError(java.lang.Exception e) {
    upstreamConsumer.closeWithError(e);
    onDownstreamError();
}