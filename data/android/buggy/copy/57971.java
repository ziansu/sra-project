@java.lang.Override
public void onPageSelected(int position) {
    if ((mCursor) != null) {
        mCursor.moveToPosition(position);
    }
    mCurrentPosition = position;
    mSelectedItemId = mCursor.getLong(ArticleLoader.Query._ID);
    updateUpButtonPosition();
}