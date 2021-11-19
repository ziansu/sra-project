@java.lang.Override
public void onLocationChanged(android.location.Location location) {
    java.lang.System.out.println(((("Longitude: " + (location.getLongitude())) + " Latitude: ") + (location.getLatitude())));
    userLocation = location;
    loadUpvoteData();
}