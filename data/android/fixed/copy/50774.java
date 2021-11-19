@java.lang.Override
public boolean onQueryTextSubmit(java.lang.String query) {
    isSearching = true;
    querySearch = query;
    mainMovieSearch.clearFocus();
    mainMovieSearch.onActionViewCollapsed();
    launchGetMovies();
    return true;
}