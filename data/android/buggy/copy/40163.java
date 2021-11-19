public void getCurrentLocation(vn.efode.vts.utils.LocationCallback callback) {
    if (checkLocationPermission()) {
        vn.efode.vts.service.TrackGPS.mLocation = LocationServices.FusedLocationApi.getLastLocation(vn.efode.vts.service.TrackGPS.mGoogleApiClient);
        callback.onSuccess();
    }
    callback.onError();
}