public com.mapbox.services.android.navigation.v5.MapboxNavigationOptions getMapboxNavigationOptions() {
    return isServiceAvailable() ? navigationService.getMapboxNavigationOptions() : options;
}