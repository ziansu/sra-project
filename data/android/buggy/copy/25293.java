public static android.database.Cursor getFavoriteMovieData(android.content.Context context) {
    com.omegaspocktari.movieprojectone.utilities.TMDbUtils.currentSortingMethod = context.getString(R.string.pref_sorting_favorites);
    return context.getContentResolver().query(FavoriteMovies.CONTENT_URI, null, null, null, null);
}