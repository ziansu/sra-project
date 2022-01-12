private java.lang.Void handleFailure(java.lang.Throwable e, net.javacrumbs.completionstage.SimpleCompletionStage<?> nextStage) {
    nextStage.completeExceptionally(wrapException(e));
    return null;
}