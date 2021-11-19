@java.lang.Override
public boolean onQueryTextChange(java.lang.String newText) {
    if (!(android.text.TextUtils.isEmpty(searchFilter))) {
        savedSearchFilter = searchFilter;
    }
    searchFilter = newText;
    getLoaderManager().restartLoader(org.xbmc.kore.ui.AbstractListFragment.LOADER, null, this);
    return true;
}