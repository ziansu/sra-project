java.lang.Boolean isEqualToCurrentSimulationTime() {
    return (stateChangeTime) == (parentCoordinator.getCurrentSimulationTime());
}