private void initBookmarkFragment() {
    type = -1;
    mMetaInfoListSource = com.java.team17.data.BookmarkManager.getInstance(com.java.team17.data.db.CacheDBOpenHelper.getInstance(getContext().getApplicationContext())).getNewsMetaInfoListSource();
    android.util.Log.i("bookmark", "bookmarkInited");
}