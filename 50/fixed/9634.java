@java.lang.Override
public boolean onQueryTextChange(java.lang.String newText) {
    mSearchText = newText;
    if ((list) != null)
        doSearch();
    
    return true;
}