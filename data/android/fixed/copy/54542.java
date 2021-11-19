private void restartLoader(java.lang.String s) {
    bundle.putString("query", s);
    if ((info) != null) {
        getSupportLoaderManager().restartLoader(com.example.oluwatimilehin.moviebuff.MovieActivity.MOVIE_LOADER_ID, bundle, new com.example.oluwatimilehin.moviebuff.MovieActivity.MovieDataLoader());
    }
}