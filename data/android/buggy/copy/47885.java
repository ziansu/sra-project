private void setLocationParameter() {
    mLocationRequest.setInterval(600000);
    mLocationRequest.setPriority(LocationRequest.PRIORITY_HIGH_ACCURACY);
    mLocationRequest.setSmallestDisplacement(25);
    mLocationRequest.setFastestInterval(60000);
}