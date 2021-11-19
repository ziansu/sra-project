@java.lang.Override
public boolean onQueryTextSubmit(java.lang.String query) {
    searchView.clearFocus();
    startFragment(query);
    return false;
}