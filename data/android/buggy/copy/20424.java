protected void stopLocationUpdates() {
    if ((runningRecord.getRunningPath().size()) > 0) {
        this.sendData();
    }
    LocationServices.FusedLocationApi.removeLocationUpdates(mGoogleApiClient, this);
}