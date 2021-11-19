@java.lang.Override
public void onLocationChanged(android.location.Location location) {
    currentLocation = location;
    double lat = location.getLatitude();
    double lng = location.getLongitude();
    editTextCity.setText(getLocationName(lat, lng));
}