private void requestGpsLocationUpdates() {
    if (!(mLocationFetcher.isRequestingUpdates())) {
        tryToExecuteLocationUpdatesInteractor();
    }
}