@java.lang.Override
public boolean onClose() {
    poiSearchAdapter.filterData("", true);
    search.setQuery("", false);
    search.clearFocus();
    return false;
}