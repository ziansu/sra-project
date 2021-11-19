@java.lang.Override
public void onLocationChanged(android.location.Location location) {
    mLastLocation = location;
    if (((mLastLocation) != null) && ((mMap) != null))
        model.updateMap(mMap, mLastLocation);
    
}