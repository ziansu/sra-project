public static void deletePermit(@android.support.annotation.NonNull
java.lang.String permitId, @android.support.annotation.Nullable
com.airmap.airmapsdk.networking.callbacks.AirMapCallback<java.lang.Void> callback) {
    if (permitId != null) {
        com.airmap.airmapsdk.networking.services.PilotService.deletePermit(permitId, callback);
    }
}