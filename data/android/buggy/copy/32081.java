private void sortByLocations(android.location.Location userLocation) {
    if (userLocation != null) {
        adapter.sortByLocation(userLocation);
    }
}