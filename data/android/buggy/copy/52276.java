@java.lang.Override
public synchronized void onLoadMore() {
    android.util.Log.d("Paginate", "onLoadMore");
    loading = true;
    movieListAdapter.add(getMovies(((currentPgNo) + 1)));
    loading = false;
}