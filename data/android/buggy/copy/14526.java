public boolean onQueryTextSubmit(java.lang.String query) {
    mQuery = getFilteredQueryString(query);
    mShowResults = true;
    setSuggestionsVisibility(false);
    updateSearchResults();
    saveQueryToDatabase();
    return true;
}