private void handleCanceled(java.lang.Throwable t) {
    if (!(isInterrupted()))
        operationCanceledManager.propagateIfCancelException(t);
    
    buildLogger.log("Build interrupted.");
    queuedBuildData.rollback();
    doRememberLastBuiltState();
}