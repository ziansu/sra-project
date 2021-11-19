public static com.google.android.maps.GeoPoint coordinatesToGeoPoint(double latitude, double longitude) {
    return new com.google.android.maps.GeoPoint(new java.lang.Double((latitude * 1000000.0)).intValue(), new java.lang.Double((longitude * 1000000.0)).intValue());
}