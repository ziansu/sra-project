@java.lang.Override
public void onConnected(android.os.Bundle bundle) {
    super.onConnected(bundle);
    updateLocation(mLastLocation);
}