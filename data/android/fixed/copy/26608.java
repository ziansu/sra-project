public void refreshMovies() {
    mSwipe.setRefreshing(true);
    mMoviesRecycleView.smoothScrollToPosition(0);
    fetchMovies();
}