protected boolean isSmartLockAvailable() {
    return (((isAdded()) && (isGooglePlayServicesAvailable())) && ((mCredentialsClient) != null)) && (mCredentialsClient.isConnected());
}