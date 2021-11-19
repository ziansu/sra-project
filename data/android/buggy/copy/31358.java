@java.lang.Override
public void onLoaderReset(android.support.v4.content.Loader<android.database.Cursor> loader) {
    android.util.Log.i("Inside onLoaderReset", "Swapped the Cursor");
    mMovieCursorAdapter.notifyDataSetChanged();
    mMovieCursorAdapter.swapCursor(null);
}