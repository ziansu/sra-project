@java.lang.Override
public void onLoaderReset(android.support.v4.content.Loader loader) {
    mCursorAdapter.getCursor().close();
    mCursorAdapter.swapCursor(null);
}