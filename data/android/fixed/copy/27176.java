public void register(java.lang.Object object) {
    synchronized(this.behaviorGuardEvaluatorRegistry) {
        this.behaviorGuardEvaluatorRegistry.register(object);
    }
}