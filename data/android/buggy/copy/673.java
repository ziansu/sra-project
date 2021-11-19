private void handleFailure(java.lang.Throwable e, net.javacrumbs.completionstage.SimpleCompletionStage<?> nextStage) {
    nextStage.completeExceptionally(wrapException(e));
}