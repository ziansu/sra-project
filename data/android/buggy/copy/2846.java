public com.mapbox.services.android.telemetry.location.LocationEngine getLocationEngine() {
    return (locationEngine) == null ? new com.mapbox.services.android.location.LostLocationEngine(context) : locationEngine;
}