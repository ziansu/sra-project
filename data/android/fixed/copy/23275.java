@java.lang.Override
public boolean onQueryTextSubmit(java.lang.String query) {
    searchString = query;
    queryForNYTimes(query);
    return true;
}