@java.lang.Override
public void onLocationChanged(android.location.Location location) {
    com.jstakun.gms.android.config.ConfigurationManager.getInstance().setLocation(location);
    mLocationHandler.sendEmptyMessage(com.jstakun.gms.android.location.GmsLocationServicesManager.UPDATE_LOCATION);
}