public static void getPilot(@android.support.annotation.NonNull
java.lang.String pilotId, @android.support.annotation.Nullable
com.airmap.airmapsdk.networking.callbacks.AirMapCallback<com.airmap.airmapsdk.models.pilot.AirMapPilot> callback) {
    if (pilotId != null) {
        com.airmap.airmapsdk.networking.services.PilotService.getPilot(pilotId, callback);
    }
}