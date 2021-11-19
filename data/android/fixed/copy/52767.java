public void onClick(android.view.View arg0) {
    mCurrentSearch = "";
    mTaxonId = null;
    mProjectId = null;
    mUsername = null;
    mLocationId = null;
    mSearchType = org.inaturalist.android.INaturalistMapActivity.FIND_NEAR_BY_OBSERVATIONS;
    mPage = 1;
    refreshActiveFilters();
    loadObservations();
}