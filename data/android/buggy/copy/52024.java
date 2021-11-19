public static android.content.UriMatcher buildUriMatcher() {
    android.content.UriMatcher uriMatcher = new android.content.UriMatcher(android.content.UriMatcher.NO_MATCH);
    me.androidbox.busbymovies.data.MovieContentProvider.sUriMatcher.addURI(MovieContract.AUTHORITY, MovieContract.PATH_MOVIE, 100);
    me.androidbox.busbymovies.data.MovieContentProvider.sUriMatcher.addURI(MovieContract.AUTHORITY, ((MovieContract.PATH_MOVIE) + "/#"), 101);
    return uriMatcher;
}