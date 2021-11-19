@java.lang.Override
public void onConnected(@android.support.annotation.Nullable
android.os.Bundle bundle) {
    displayLocation();
    if (mRequestingLocalUpdates) {
        startLocationUpdates();
    }
}