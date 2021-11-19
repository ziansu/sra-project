public void loadMoviesMostPopular() {
    setLoading(true);
    setMovies(new java.util.ArrayList<es.glitch.and.bugs.popmovies.Movie>());
    mode = TheMovieDBClient.MOST_POPULAR;
    new es.glitch.and.bugs.popmovies.MoviesAdapter.LoadMoviesTask().execute(mode, java.lang.String.valueOf(pageIndex));
}