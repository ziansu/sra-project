public void setupExternal(me.leofontes.movies.Models.Movie m, boolean fromFavorite) {
    movie = m;
    fromFavoriteList = fromFavorite;
    if ((movie) != null) {
        populateFields(movie);
    }
    configureFragment();
}