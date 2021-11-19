private boolean checkAccess() {
    @java.lang.SuppressWarnings(value = "deprecation")
    java.lang.String provider = Settings.Secure.getString(getContentResolver(), Settings.Secure.LOCATION_PROVIDERS_ALLOWED);
    return (isConnectingToInternet()) && (provider.contains("gps"));
}