private android.database.Cursor checkFavorite() {
    com.example.nizamudeenms.myflikz.MovieDbHelper movieDbHelper = new com.example.nizamudeenms.myflikz.MovieDbHelper(this);
    mMovieDb = movieDbHelper.getReadableDatabase();
    android.database.Cursor cFavoriteMovies = getFavoriteMovies();
    return cFavoriteMovies;
}