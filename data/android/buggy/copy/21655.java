public boolean onQueryTextSubmit(java.lang.String query) {
    doSearch();
    list.setVisibility(View.GONE);
    searchView.refreshDrawableState();
    createUsersSelectedFoods();
    return false;
}