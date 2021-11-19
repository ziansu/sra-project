@java.lang.Override
public void onLocationChanged(android.location.Location location) {
    if (location != null) {
        updateLocation(location);
    }else
        if ((mListener) != null) {
            mListener.onLocationFailed();
        }
    
    LocationServices.FusedLocationApi.removeLocationUpdates(mGoogleApiClient, this);
}