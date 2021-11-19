public boolean isStepFailed() {
    return (((capi) != null) && ((capi.getStorage()) != null)) && ((capi.getStorage().getLastInconsistentUpdate()) != null);
}