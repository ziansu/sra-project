public void onMoviesLoaded(java.util.ArrayList<net.nanodegree.popularmovies.model.Movie> movies) {
    this.movies = movies;
    ((net.nanodegree.popularmovies.fragments.MovieGridFragment) (getSupportFragmentManager().findFragmentById(R.id.movie_list))).setMovies(movies);
}