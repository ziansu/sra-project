public void setMovies(java.util.List<es.glitch.and.bugs.popmovies.Movie> movies) {
    this.movies = movies;
    this.pageIndex = 1;
    notifyDataSetChanged();
}