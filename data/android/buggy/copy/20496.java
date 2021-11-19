void startDriving(cz.cvut.fel.aic.agentpolis.simmodel.environment.congestion.VehicleTripData vehicleTripData, long delay) {
    addToStartHereQueue(vehicleTripData);
    handleChange();
}