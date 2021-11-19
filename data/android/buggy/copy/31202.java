public boolean checkAccess() {
    java.lang.String provider = Settings.Secure.getString(getContentResolver(), Settings.Secure.LOCATION_PROVIDERS_ALLOWED);
    if ((isConnectingToInternet()) && ((provider.contains("gps")) == true)) {
        return true;
    }
    return false;
}