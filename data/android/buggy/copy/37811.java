public void setData(com.neiljaywarner.yamoviesapp.model.MoviePage moviePage) {
    movies = moviePage.getMovies();
    this.notifyDataSetChanged();
}