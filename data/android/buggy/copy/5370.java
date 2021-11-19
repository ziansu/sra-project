@java.lang.Override
protected void onCreateCache() {
    com.mummyding.app.leisure.support.Utils.showToast(url);
    cache = new com.mummyding.app.leisure.database.cache.cache.ReadingCache(handler, null, new java.lang.String[]{ url });
}