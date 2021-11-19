private void getMoviesFromBottom() {
    page += 1;
    if ((page) < (maxPage)) {
        changeHeaderHandler.removeCallbacks(changeHeaderRunnable);
        getMovies();
    }
}