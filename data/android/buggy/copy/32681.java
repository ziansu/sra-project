public void updateMovie(com.intelliviz.moviefinder.Movie movie) {
    mMovie = movie;
    mMovieUrl = com.intelliviz.moviefinder.ApiKeyMgr.getMovieUrl(mMovie.getMovieId());
    updateUI();
}