public void consumeDrone(java.lang.String buildingName) {
    (workerNumber)--;
    resourcesHandler.miningPQPeekRemove(buildingName);
    supplyHandler.decreaseSupply(xUnit[0].getSupply());
}