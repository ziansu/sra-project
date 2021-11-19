@java.lang.Override
public void onLoadFinished(android.support.v4.content.Loader<android.database.Cursor> loader, android.database.Cursor data) {
    android.util.Log.i(com.dailynews.dailynews.widget.fragment.PageFragment.TAG, ("mTopic: " + (mTopic)));
    mLoadNewsAdapter.swapCursor(data);
}