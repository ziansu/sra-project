protected void createLocationRequest() {
    mLocationRequest = new com.google.android.gms.location.LocationRequest();
    mLocationRequest.setInterval(Constants.UPDATE_INTERVAL_IN_MILLISECONDS);
    mLocationRequest.setFastestInterval(Constants.FASTEST_UPDATE_INTERVAL_IN_MILLISECONDS);
    mLocationRequest.setPriority(LocationRequest.PRIORITY_BALANCED_POWER_ACCURACY);
}