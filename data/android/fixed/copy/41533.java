public void setGeofenceEnabled(boolean enabled) {
    editor.putBoolean(nl.hnogames.domoticz.Utils.SharedPrefUtil.PREF_GEOFENCE_ENABLED, enabled).apply();
    editor.commit();
}