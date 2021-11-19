@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setRetainInstance(true);
    setHasOptionsMenu(true);
    android.util.Log.d(com.beccap.weathervane.WeatherListFragment.TAG, "in onCreate, connecting to google api services");
    _googleApiClient = buildGoogleApiClient();
    _googleApiClient.connect();
}