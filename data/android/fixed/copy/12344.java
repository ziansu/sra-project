@java.lang.Override
public void onSharedPreferenceChanged(android.content.SharedPreferences sharedPreferences, java.lang.String key) {
    if (key.equals(getString(R.string.pref_key))) {
        getSupportLoaderManager().restartLoader(org.sluman.movies.MovieListActivity.MOVIE_LOADER, null, this);
    }
}