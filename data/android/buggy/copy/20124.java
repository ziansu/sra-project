@java.lang.Override
public void onLoaderReset(android.support.v4.content.Loader<android.database.Cursor> loader) {
    android.widget.Toast.makeText(getApplicationContext(), "Provider resetting", Toast.LENGTH_SHORT).show();
    mTaskCursorAdapter.swapCursor(null);
}