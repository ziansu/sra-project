private void redrawAllPoints() {
    mMap.clear();
    com.runnerapp.runnerapp.LocationCollection locationCollection = com.runnerapp.runnerapp.LocationCollection.getInstance();
    drawMapPoints(locationCollection.getAllLocationsUnwound().get(0), locationCollection.getAllLocationsUnwound());
}