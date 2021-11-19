private void sortByLocations(android.location.Location userLocation) {
    if ((userLocation != null) && ((mAdapter) != null)) {
        sortOrder = org.septa.android.app.models.SortOrder.LOCATION;
        returnedLocation = userLocation;
        mAdapter.sortByLocation(userLocation);
        removeSortOptions();
    }
}