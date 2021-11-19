@java.lang.Override
public void onLoadFinished(android.support.v4.content.Loader<android.database.Cursor> loader, android.database.Cursor data) {
    if ((data != null) && ((adapter) != null))
        adapter.swapCursor(data);
    
}