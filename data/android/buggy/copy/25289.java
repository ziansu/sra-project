public void onLocationChanged() {
    if (BuildConfig.DEBUG) {
        android.util.Log.d(LOG_TAG, "onLocationChanged");
    }
    updateWeather();
    getLoaderManager().restartLoader(com.dev.tonylyu.sunshine.ForecastFragment.WEATHER_LOADER_ID, null, this);
}