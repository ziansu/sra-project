@java.lang.Override
public void onPlaceSelected(com.google.android.gms.location.places.Place place) {
    vacationLatitude = place.getLatLng().latitude;
    vacationLongitude = place.getLatLng().longitude;
    android.util.Log.i(com.example.kevin.wear_where.MainActivity.TAG, ("Place: " + (place.getName())));
}