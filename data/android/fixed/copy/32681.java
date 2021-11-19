public void updateMovie(com.intelliviz.moviefinder.Movie movie) {
    mMovie = movie;
    if ((mMovie) != null) {
        mMovieUrl = com.intelliviz.moviefinder.ApiKeyMgr.getMovieUrl(mMovie.getMovieId());
    }
    updateUI();
}