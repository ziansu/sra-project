private java.lang.IllegalArgumentException throwNotSupported(com.sonar.orchestrator.locator.Location location) {
    return new java.lang.IllegalArgumentException(("Unknown location type: " + (location.getClass())));
}