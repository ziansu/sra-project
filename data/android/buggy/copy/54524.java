public boolean isStepFailed() {
    return ((capi.getStorage()) != null) && ((capi.getStorage().getLastInconsistentUpdate()) != null);
}