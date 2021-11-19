public void moveGPSScreen() {
    android.content.Intent gpsOptionsIntent = new android.content.Intent(android.provider.Settings.ACTION_LOCATION_SOURCE_SETTINGS);
    startActivity(gpsOptionsIntent);
}