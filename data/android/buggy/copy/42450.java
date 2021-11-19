@java.lang.Override
public void onStatusChanged(java.lang.String arg0, int arg1, android.os.Bundle arg2) {
    if ((org.immopoly.android.helper.LocationHelper.mlocListener) != null)
        org.immopoly.android.helper.LocationHelper.mLocationManager.removeUpdates(org.immopoly.android.helper.LocationHelper.mlocListener);
    
    org.immopoly.android.helper.LocationHelper.mlocListener = null;
    if (callback != null) {
        callback.onLocationChanged(true);
    }
}