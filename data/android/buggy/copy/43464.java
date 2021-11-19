@java.lang.Override
public void onLoaderReset(android.support.v4.content.Loader<android.database.Cursor> loader) {
    android.util.Log.d("Ziolle", "onLoaderReset");
    mForecastAdapter.swapCursor(null);
}