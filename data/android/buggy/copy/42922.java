@java.lang.Override
protected void onPostExecute(java.lang.Void aVoid) {
    android.app.LoaderManager loaderManager = getLoaderManager();
    loaderManager.initLoader(ahmadadam96.comicbookmovies.MainActivity.MOVIE_LOADER_ID, null, this);
    loaderManager.initLoader(ahmadadam96.comicbookmovies.MainActivity.CODES_LOADER_ID, null, this);
    mSwipeRefreshLayout.setRefreshing(false);
}