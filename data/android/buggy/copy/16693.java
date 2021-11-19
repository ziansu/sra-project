@java.lang.Override
public boolean onQueryTextSubmit(java.lang.String query) {
    search(query);
    mSearchView.clearFocus();
    return true;
}