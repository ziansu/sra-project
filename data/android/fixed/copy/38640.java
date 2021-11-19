@java.lang.Override
public void run() {
    android.location.Location last = LocationServices.FusedLocationApi.getLastLocation(googleApiClient);
    com.ibm.pisdk.geofencing.PIGeofencingService.log.debug(("setInitialLocation() last location = " + last));
    if (last != null) {
        geofenceManager.onLocationChanged(last, true);
    }
}