public static void getFlight(@android.support.annotation.NonNull
java.lang.String flightId, boolean enhance, @android.support.annotation.Nullable
com.airmap.airmapsdk.networking.callbacks.AirMapCallback<com.airmap.airmapsdk.models.flight.AirMapFlight> callback) {
    if (flightId != null) {
        com.airmap.airmapsdk.networking.services.FlightService.getFlight(flightId, enhance, callback);
    }
}