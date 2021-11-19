@java.lang.Override
public boolean onQueryTextChange(java.lang.String newText) {
    poiSearchAdapter.filterData(newText, false);
    expandAll();
    return false;
}