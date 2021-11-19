@java.lang.Override
public void onLocationChanged(android.location.Location location) {
    mLastLocation = location;
    android.util.Log.d(com.agusgarcia.geonotes.MapFragment.TAG, ("onLocationChanged" + (mLastLocation.toString())));
    handleNewLocation(location);
}