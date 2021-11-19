public void onLocationChanged() {
    if (BuildConfig.DEBUG) {
        android.util.Log.d(LOG_TAG, "onLocationChanged");
    }
    updateWeather();
}