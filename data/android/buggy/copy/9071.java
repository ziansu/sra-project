private void requestGpsLocationUpdates() {
    if (!(isGpsGranted())) {
        requestGpsPermission();
    }else
        if (!(mLocationFetcher.isRequestingUpdates())) {
            tryToExecuteLocationUpdatesInteractor();
        }
    
}