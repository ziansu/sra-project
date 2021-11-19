@java.lang.Override
public void onResume() {
    super.onResume();
    android.util.Log.d(com.beccap.weathervane.WeatherStatusFragment.TAG, "calling onResume");
    _mapView.onResume();
}