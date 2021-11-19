@java.lang.Override
public void onLoadMore(int currentPage) {
    android.util.Log.d(MovieApplication.TAG, (((com.example.vit.popularmovies.ui.fragment.MoviesGridFragment.CLASS) + "onLoadMore() page = ") + currentPage));
    loadMoviesPage(currentPage);
}