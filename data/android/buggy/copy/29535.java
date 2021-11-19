private boolean activityIsStartingForTheFirstTime(android.os.Bundle savedInstanceState) {
    return ((savedInstanceState == null) || (!(savedInstanceState.containsKey(com.popularmovies.popularmovies.activities.PopularMoviesActivity.KEY_MOVIES)))) || (!(favoriteMovieCursorWasSaved(savedInstanceState)));
}