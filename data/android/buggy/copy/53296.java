private void changeSortOrder(final com.setiawanpaiman.tmdb.android.movielist.MovieListContract.Presenter.SortOrder oldSortOrder, final com.setiawanpaiman.tmdb.android.movielist.MovieListContract.Presenter.SortOrder newSortOrder) {
    if (oldSortOrder == newSortOrder) {
        return ;
    }
    mSortOrder = newSortOrder;
    onRefresh();
}