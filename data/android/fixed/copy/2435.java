@java.lang.Override
public void onLocationChanged(android.location.Location location) {
    userLocation = location;
    loadUpvoteData();
}