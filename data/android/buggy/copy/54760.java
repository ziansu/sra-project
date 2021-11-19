@java.lang.Override
public void onActivityCreated(android.os.Bundle savedInstanceState) {
    android.util.Log.i(Constants.APP_NAME, "onActivityCreated: to initLoader");
    getLoaderManager().initLoader(com.franktan.popularmovies.MoviesGridFragment.MOVIE_LOADER_ID, null, this);
    super.onActivityCreated(savedInstanceState);
}