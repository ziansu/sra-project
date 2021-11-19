@java.lang.Override
public void onActivityCreated(android.os.Bundle savedInstanceState) {
    getLoaderManager().initLoader(com.example.shreekant.sunshine.app.ForecastFragment.FORECAST_LOADER_ID, null, this);
    super.onActivityCreated(savedInstanceState);
    android.util.Log.v(LOG_TAG, "onActivityCreated: initLoader");
}