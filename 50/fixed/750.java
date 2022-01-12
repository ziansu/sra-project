public static com.google.android.maps.GeoPoint coordinatesToGeoPoint(double latitude, double longitude) {
    return new com.google.android.maps.GeoPoint(((int) (latitude * 1000000.0)), ((int) (longitude * 1000000.0)));
}