@java.lang.Override
public android.app.Fragment getItem(int position) {
    mCursor.moveToPosition(position);
    return com.example.xyzreader.ui.ArticleDetailFragment.newInstance(mCursor.getLong(ArticleLoader.Query._ID), position);
}