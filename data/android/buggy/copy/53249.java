public static com.hgyllensvard.geofencemanager.geofence.Geofence create(java.lang.String name, com.google.android.gms.maps.model.LatLng latLng, float radius) {
    return new com.hgyllensvard.geofencemanager.geofence.AutoValue_Geofence.Builder().id(com.hgyllensvard.geofencemanager.geofence.Geofence.NO_ID).name(name).latLng(latLng).radius(radius).build();
}