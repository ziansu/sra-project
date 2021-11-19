@java.lang.Override
public boolean onQueryTextSubmit(java.lang.String s) {
    searchOnYoutube(s);
    mSearchView.clearFocus();
    finish();
    return true;
}