@java.lang.Override
public boolean onQueryTextSubmit(java.lang.String s) {
    searchOnYoutube(s);
    mSearchView.clearFocus();
    return true;
}