public static android.location.Location locFromLatLng(com.google.android.gms.maps.model.LatLng input) {
    android.location.Location result = new android.location.Location("");
    result.setLatitude(input.latitude);
    result.setLongitude(input.longitude);
    return result;
}