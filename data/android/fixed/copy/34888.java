@java.lang.Override
public void onActivityCreated(android.os.Bundle savedInstanceState) {
    android.util.Log.d(com.xiongxh.popularmovies.fragments.MovieGridFragment.LOG_TAG, "MoviesGridFragment starts!");
    super.onActivityCreated(savedInstanceState);
    getLoaderManager().initLoader(com.xiongxh.popularmovies.fragments.MovieGridFragment.LOADER_ID, null, this);
}