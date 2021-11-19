private boolean isTestingPhase() {
    java.lang.String phase = execution.getLifecyclePhase();
    return (phase != null) && ((phase.equals("test")) || (phase.equals("integration-test")));
}